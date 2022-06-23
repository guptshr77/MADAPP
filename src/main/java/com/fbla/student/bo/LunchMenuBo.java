package com.fbla.student.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fbla.student.dal.LunchMenuDAO;
import com.fbla.student.model.LunchMenu;

@Component
public class LunchMenuBo {
//object wired to DAO 	
	@Autowired
	private LunchMenuDAO lunchMenuDAO;
//get the school lunchmenu	
	public List<LunchMenu> getMenu() {
		return lunchMenuDAO.getMenu();
	}
}
