package com.fbla.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fbla.student.bo.LunchMenuBo;
import com.fbla.student.model.LunchMenu;

@RestController
public class LunchMenuController {
	
	@Autowired
	private LunchMenuBo lunchMenuBO;

	@GetMapping ("/lunchmenu")
	public List<LunchMenu> getLunchMenu() {
		return lunchMenuBO.getMenu();
		//pass the menu to VS Code
	}
}
