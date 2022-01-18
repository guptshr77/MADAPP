package com.fbla.student.dal;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Component;

import com.fbla.student.model.User;



@Component
public class UserDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<User> login(User user) {
		String query = "SELECT userid, firstname, lastname, username FROM suser WHERE username=? AND password=?";
				
		return jdbcTemplate.query(query,
				(rs, rowNum) ->
				new User(
						rs.getInt("userid"),
						rs.getString("firstname"),
						rs.getString("lastname"),
						rs.getString("username")),
				new Object[] {user.getUsername(),user.getPassword()});
	}
}