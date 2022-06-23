package com.fbla.student.dal;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Component;

import com.fbla.student.model.User;
import com.fbla.student.model.Bug;

@Component
public class BugReportingDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

//to report a bug
	public String reportBug(Bug message) {
		String stmt = "INSERT INTO bug_reporting(user_id, bug) VALUES(?, ?)";
		
		jdbcTemplate.execute(stmt, new PreparedStatementCallback<Boolean>() {
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps)
				throws SQLException, DataAccessException {
					ps.setInt(1, message.getUserId());
					ps.setString(2, message.getMessage());
					
					return ps.execute();
			}
		});
		
		return "Sorry about the inconvinience but we have recieved your message and will work to fix it ASAP.";
		
	}
}
