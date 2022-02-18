package com.fbla.student.dal;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Component;

import com.fbla.student.model.Message;
import com.fbla.student.model.User;



@Component
public class MessageDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public String sendMessage(Message message) {
		String stmt = "INSERT INTO message(sender_id, recipient_user_id, subject, msg_content) VALUES(?, ?, ?, ?)";
		
		jdbcTemplate.execute(stmt, new PreparedStatementCallback<Boolean>() {
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps)
				throws SQLException, DataAccessException {
					ps.setInt(1, message.getUserId());
					ps.setInt(2, message.getRecipientUserId());
					ps.setString(3, message.getSubject());
					ps.setString(4, message.getMsgContent());
					
					return ps.execute();
			}
		});
		
		return "Message Sent";
		
	}
	
	public List<Message> getMessages(int userId){
		String query = "SELECT u.user_id, u.firstname, u.lastname, m.subject, m.msg_content m.msg_id, m.msg_date sFROM message m, suser u WHERE m.sender_id = u.user_id AND recipient_id = ? ORDER BY msg_id DESC";
		
		return jdbcTemplate.query(query,
				(rs, rowNum) ->
				new Message(
						new User(rs.getInt("user_id"),rs.getString("firstname"), rs.getString("lastname")),
						rs.getString("subject"),
						rs.getString("msg_content"),
						rs.getInt("msg_id"),
						rs.getDate("msg_date")),
				new Object[] {userId});
	}

}
