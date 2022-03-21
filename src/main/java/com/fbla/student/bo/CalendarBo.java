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
	
	@Autowired
	private EventsDAO eventsdao;
	@Autowired
	private ExtracurricularDAO actdao;
	@Autowired
	private ScheduleDAO scheduledao;
	
	
	public Calendar getCalendar(String type, Date date, int userid){
		Calendar calendar = null;
		
		System.out.println("Date:" + date.toString());
		
		if(type.equals("monthly")) {
			
			int month = date.getMonth();
			
			List<SchoolClass> schedule = scheduledao.dailySchedule(userid);
			List<Event> events = eventsdao.eventsMonthly(month);
//			List<Extracurricular> acts = actdao.monthlyExtracurricular(userid, month);
			
//			calendar = new Calendar(schedule, events, acts);
			
		}else if(type.equals("daily")){
			List<SchoolClass> schedule = null;
			System.out.println(date.toString());
			if(!(date.toString().contains("Mon")) || 
					(!(date.toString().contains("Tue"))) || 
					(!(date.toString().contains("Wed"))) || 
					(!(date.toString().contains("Thu"))) || 
					(!(date.toString().contains("Fri")))){
				schedule = scheduledao.dailySchedule(userid);	
			}
			
			List<Event> events = eventsdao.eventsDaily(date);
			List<Extracurricular> acts = actdao.dailyExtracurricular(userid, date);
				
			calendar = new Calendar(schedule, events, acts);
			
		}
		
		return calendar;
	}
	
	public List<Extracurricular> getAllActivities(){
		return actdao.getAllActivities();
	}
	
	public String addActivity(int userId, int actId) {
		return actdao.addActivity(userId, actId);
	}

	public List<Extracurricular> getActivities(int userId) {
		return actdao.getActivities(userId);
	}

}
