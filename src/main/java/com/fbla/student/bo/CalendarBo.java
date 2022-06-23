package com.fbla.student.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fbla.student.dal.EventsDAO;
import com.fbla.student.dal.ExtracurricularDAO;
import com.fbla.student.dal.ScheduleDAO;
import com.fbla.student.model.Calendar;
import com.fbla.student.model.User;
import com.fbla.student.model.SchoolClass;
import com.fbla.student.model.Event;
import com.fbla.student.model.Extracurricular;

import java.sql.Date;
import java.time.*;
import java.util.List; 

@Component
public class CalendarBo {
//wired to DAO Classes objects	
	@Autowired
	private EventsDAO eventsdao;
	@Autowired
	private ExtracurricularDAO actdao;
	@Autowired
	private ScheduleDAO scheduledao;
	
	
	public Calendar getCalendar(String type, Date date, int userid){
		Calendar calendar = null;
		
		System.out.println("Date:" + date.toString());
//get monthly calendar		
		if(type.equals("monthly")) {
			
			int month = date.getMonth();
			
			List<SchoolClass> schedule = scheduledao.dailySchedule(userid);
			List<Event> events = eventsdao.eventsMonthly(month);
//get daily calendar			
		}else if(type.equals("daily")){
			List<SchoolClass> schedule = null;
			System.out.println(date.getDay());
			if(date.getDay() != 0 && date.getDay() != 6 ){
				schedule = scheduledao.dailySchedule(userid);	
			}
			
			List<Event> events = eventsdao.eventsDaily(date);
			List<Extracurricular> acts = actdao.dailyExtracurricular(userid, date);
				
			calendar = new Calendar(schedule, events, acts);
			
		}
		
		return calendar;
	}
//get all extracurricular activities offered
	public List<Extracurricular> getAllActivities(){
		return actdao.getAllActivities();
	}
//add extracurricular activity to user's schedule	
	public String addActivity(int userId, int actId) {
		return actdao.addActivity(userId, actId);
	}
//get activities that the user is a part of
	public List<Extracurricular> getActivities(int userId) {
		return actdao.getActivities(userId);
	}

}
