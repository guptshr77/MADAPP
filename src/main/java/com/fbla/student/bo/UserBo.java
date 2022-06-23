package com.fbla.student.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fbla.student.dal.UserDAO;
import com.fbla.student.model.User;

@Component
public class UserBo {
//object to call user 	
	@Autowired
	private UserDAO userdao;
	
	public User login(User user) {
		return userdao.login(user);
	}
//create new user	
	public User addUser(User user) {
		return userdao.addUser(user);
	}
//get the list of all teacher users that students can send messages to	
	public List<User> teachers(){
		return userdao.teachers();
	}
}
