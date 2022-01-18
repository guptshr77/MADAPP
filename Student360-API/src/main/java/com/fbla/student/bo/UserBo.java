package com.fbla.student.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fbla.student.dal.UserDAO;
import com.fbla.student.model.User;

@Component
public class UserBo {
	
	@Autowired
	private UserDAO userdao;
	
	public List<User> login(User user) {
		return userdao.login(user);
	}
}
