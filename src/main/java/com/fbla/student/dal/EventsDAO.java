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

import com.fbla.student.model.Event;



@Component
public class EventsDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Event> eventsDaily(Date date){
		String query = "SELECT event_id, dates, title, descr FROM events WHERE DATE(dates) =?";
		
		return jdbcTemplate.query(query,
				(rs, rowNum) ->
				new Event(
						rs.getInt("event_id"),
						rs.getTimestamp("dates"),
						rs.getString("title"),
						rs.getString("descr")),
				new Object[] {date});
	}
	
	public List<Event> eventsMonthly(int month) {
		String query = "SELECT * FROM events WHERE EXTRACT(MONTH FROM dates)::integer = ?";
		
		return jdbcTemplate.query(query, 
				(rs, rowNum) ->
				new Event(
						rs.getInt("event_id"),
						rs.getTimestamp("dates"),
						rs.getString("title"),
						rs.getString("descr")),
				new Object[] {month});
	}
}
