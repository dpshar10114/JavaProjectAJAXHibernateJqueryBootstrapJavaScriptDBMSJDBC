package com.newgen.employeeDataDAO;

import javax.servlet.http.HttpServletRequest;

import com.newgen.services.EmployeeDataService;

public class employeeDataDAO {
	
	public void storeDataDB(HttpServletRequest request) {
		String mail = request.getParameter("eMail");
		String name = request.getParameter("name");
		String loc = request.getParameter("loc");
		String dept = request.getParameter("Department");
		String contact = request.getParameter("contact");
		
		EmployeeDataService empDS = new EmployeeDataService();
		empDS.saveEmployeeData(mail,name,loc,dept,contact);
	}

}
