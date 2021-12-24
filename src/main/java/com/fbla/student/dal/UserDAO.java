package com.fbla.student.dal;

import com.fbla.student.model.User;

public class UserDAO {

	public User login(User loginInfo) {
		User user = null;
		System.out.println(loginInfo.getUsername());
		return user;
	}
}
