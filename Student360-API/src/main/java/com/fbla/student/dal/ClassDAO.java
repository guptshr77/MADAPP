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
	
	public List<SchoolClass> getAllClasses(){
		String query = "SELECT * FROM class ORDER BY classname";
		
		return jdbcTemplate.query(query,
				(rs, rowNum) ->
				new SchoolClass(
						rs.getInt("class_id"),
						rs.getString("classname")));
	}
}
