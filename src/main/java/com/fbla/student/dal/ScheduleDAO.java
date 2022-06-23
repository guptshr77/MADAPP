package com.fbla.student.dal;

import java.sql.Date;
import java.sql.Time;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Component;

import com.fbla.student.model.Calendar;
import com.fbla.student.model.Event;
import com.fbla.student.model.Extracurricular;
import com.fbla.student.model.User;
import com.fbla.student.model.SchoolClass;

@Component
public class ScheduleDAO {
//wired to jdbc template that connects to database and makes object and returns it	
	@Autowired
	private JdbcTemplate jdbcTemplate;
//get user's daily schedule	
	public List<SchoolClass> dailySchedule(int userid){
		String query = "SELECT c.* FROM class c, user_class uc WHERE c.class_id = uc.class_id AND uc.user_id = ?";
		
		return jdbcTemplate.query(query,
				(rs, rowNum) ->
				new SchoolClass(
						rs.getInt("class_id"),
						rs.getString("classname"),
						rs.getInt("roomnum"),
						rs.getTime("start_time"),
						rs.getTime("end_time")),
				new Object[] {userid});
		
	}
}
