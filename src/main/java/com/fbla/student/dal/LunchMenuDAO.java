package com.fbla.student.dal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.fbla.student.model.LunchMenu;

@Component
public class LunchMenuDAO {
//wired to jdbc template that connects to database and makes object and returns it	
	@Autowired
	private JdbcTemplate jdbcTemplate;
//get school lunch menu	
	public List<LunchMenu> getMenu() {
		String query = "SELECT * FROM lunch_menu;";
		
		return jdbcTemplate.query(query,
				(rs, rowNum) ->
				new LunchMenu(
						rs.getString("weekday_id"),
						rs.getString("fooditems"),
						rs.getString("grabngo"),
						rs.getString("milks")));	
	}
}
