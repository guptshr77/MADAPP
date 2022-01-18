package com.fbla.student.dal;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Component;

import com.fbla.student.model.Calendar;

@Component
public class CalendarDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Calendar> monthlyCal(LocalDate date){
		return null;
	}
	
	public List<Calendar> weeklyCal(LocalDate date){
		return null;
	}
	
	public List<Calendar> dailyCal(LocalDate date){
		return null;
	}
}
