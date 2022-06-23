package com.fbla.student.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fbla.student.dal.BugReportingDAO;
import com.fbla.student.model.Bug;

@Component
public class BugBo {
//wired to Bug DAO object
	@Autowired
	private BugReportingDAO bugdao;
	
//reporting Bug
	public String reportBug(Bug bug) {
		return bugdao.reportBug(bug);
	}
}
