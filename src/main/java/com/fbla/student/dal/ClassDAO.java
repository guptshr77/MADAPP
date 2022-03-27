package com.fbla.student.dal;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Component;

import com.fbla.student.model.SchoolClass;
import com.fbla.student.model.Message;

@Component
public class ClassDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public String addClass(int userId, int classId) {
		if(getUserClassCount(userId, classId) != 0) {
			return "Class added";
		}
		
		String stmt = "INSERT INTO user_class(user_id, class_id) VALUES(?,?)";
		
		jdbcTemplate.execute(stmt, new PreparedStatementCallback<Boolean>() {
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps)
				throws SQLException, DataAccessException {
					ps.setInt(1, userId);
					ps.setInt(2, classId);
					
					return ps.execute();
			}
		});
		
		return "Class added";
	}
	
	private int getUserClassCount (int userId, int classId) {
		String query = "SELECT COUNT(*) FROM user_class WHERE class_id = ? and user_id = ? ";
		
		return jdbcTemplate.queryForObject(query, new Object[] {classId, userId}, Integer.class);
	}
	
	public List<SchoolClass> getAllClasses(){
		String query = "SELECT * FROM class ORDER BY classname";
		
		return jdbcTemplate.query(query,
				(rs, rowNum) ->
				new SchoolClass(
						rs.getInt("class_id"),
						rs.getString("classname")));
	}
	
	public List<SchoolClass> getClasses(int userId){
		String query = "SELECT c.* FROM class c, user_class uc WHERE c.class_id = uc.class_id AND uc.user_id = ?";
		
		return jdbcTemplate.query(query,
				(rs, rowNum) ->
				new SchoolClass(
						rs.getInt("class_id"),
						rs.getString("classname"),
						rs.getInt("roomnum"),
						rs.getTime("start_time"),
						rs.getTime("end_time")),
				new Object[] {userId});
	}
}
