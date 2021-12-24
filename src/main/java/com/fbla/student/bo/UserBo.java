package com.fbla.student.bo;

import com.fbla.student.dal.UserDAO;
import com.fbla.student.model.User;

public class UserBo {
	public User login(User loginInfo) {
		UserDAO logindao = new UserDAO();
		return logindao.login(loginInfo);
	}
}
