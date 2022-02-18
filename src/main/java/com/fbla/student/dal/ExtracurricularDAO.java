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
public class ExtracurricularDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Extracurricular> dailyExtracurricular(int userId, Date date){
		String query = "SELECT e.* FROM extracurricular e, user_extracurricular ue WHERE e.extracurricular_id = ue.extracurriclar_id AND ue.user_id = ? AND e.edate = ?";
		
		return jdbcTemplate.query(query,
				(rs, rowNum) ->
				new Extracurricular(
						rs.getInt("act_id"),
						rs.getString("title"),
						rs.getString("location"),
						rs.getString("descr"),
						rs.getTime("start_time"),
						rs.getTime("end_time"),
						rs.getDate("edate")),
				new Object[] {userId,date});
	}
	
	public List<Extracurricular> monthlyExtracurricular(int userid, int month){
		String query = "SELECT e.* FROM extracurricular e, user_extracurricular ue WHERE e.act_id = ue.act_id AND	EXTRACT(MONTH FROM e.edate)::integer = ? AND ue.user_id = ?";
		
		return jdbcTemplate.query(query,
				(rs, rowNum) ->
				new Extracurricular(
						rs.getInt("act_id"),
						rs.getString("title"),
						rs.getString("location"),
						rs.getString("descr"),
						rs.getTime("start_time"),
						rs.getTime("end_time"),
						rs.getDate("edate")),
				new Object[] {userid,month});
	}
	
	public String addActivity(int userId, int actId) {
		String stmt = "INSERT INTO user_extracurricular(user_id, act_id) VALUES(?,?)";
		
		jdbcTemplate.execute(stmt, new PreparedStatementCallback<Boolean>() {
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps)
				throws SQLException, DataAccessException {
					ps.setInt(1, userId);
					ps.setInt(2, actId);
					
					return ps.execute();
			}
		});
		
		return "Activity added";
	}
	
	public List<Extracurricular> getAllActivities(){
		String query = "SELECT * FROM extracurricular ORDER BY title";
		
		return jdbcTemplate.query(query,
				(rs, rowNum) ->
				new Extracurricular(
						rs.getInt("act_id"),
						rs.getString("title")));
	}
	
}
