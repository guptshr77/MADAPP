package com.fbla.student.dal;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Component;

import com.fbla.student.model.LunchMenu;
import com.fbla.student.model.User;



@Component
public class UserDAO {
//wired to jdbc template that connects to database and makes object and returns it	
	@Autowired
	private JdbcTemplate jdbcTemplate;
//user login
	public User login(User user) {
		String query = "SELECT user_id, firstname, lastname, username FROM suser WHERE username=? AND password=?";
				
			List<User> luser = jdbcTemplate.query(query,
				(rs, rowNum) ->
				new User(
						rs.getInt("user_id"),
						rs.getString("firstname"),
						rs.getString("lastname"),
						rs.getString("username")),
				new Object[] {user.getUsername(),user.getPassword()});
		if(luser.size()>0) 
			return luser.get(0);
		else
			return null;
	}
//add new user	
    public User addUser(User user){
        String stmt = "INSERT INTO suser(userid, username, password, firstname, lastname) VALUES(?, ?, ?, ?, ?)";
        
        jdbcTemplate.execute(stmt, new PreparedStatementCallback<Boolean>(){
        	@Override
        	public Boolean doInPreparedStatement(PreparedStatement ps)
	        	throws SQLException, DataAccessException {
	        		ps.setInt(1, user.getUserId());
	        		ps.setString(2, user.getUsername());
	        		ps.setString(3, user.getPassword());
	        		ps.setString(4, user.getFirstName());
	        		ps.setString(5, user.getLastName());
	        		
	        		return ps.execute();
	        	}
        });
        
        return user;
    }
//create a new teacher     
	public List<User> teachers() {
		String query = "SELECT * FROM suser WHERE usertype = false";
		
		return jdbcTemplate.query(query,
				(rs, rowNum) ->
				new User(
						rs.getInt("user_id"),
						rs.getString("firstname"),
						rs.getString("lastname"),
						rs.getString("username")));	
	}
    
}