package com.fbla.student.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fbla.student.dal.CalendarDAO;
import com.fbla.student.model.Calendar;

import java.time.*;
import java.util.List; 

@Component
public class CalendarBo {
	
	@Autowired
	private CalendarDAO calendardao;
	
	public List<Calendar> getCalendar(String type, LocalDate date){
		if(type.equals("monthly")) {
			//monthly calendar
		}else if(type.equals("weekly")) {
			//weekly calendar
		}else if(type.equals("daily")){
			//daily calendar 
		}
		
		return null;
	}

}
