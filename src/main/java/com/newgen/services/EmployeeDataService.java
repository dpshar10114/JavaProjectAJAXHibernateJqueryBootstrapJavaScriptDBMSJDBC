package com.newgen.services;

import org.hibernate.Session;

import com.newgen.common.databaseConnection;
import com.newgen.form.EmployeeData;

public class EmployeeDataService {
	
	public void saveEmployeeData(String eMail, String name, String loc, String dept, String contact) {
		
		EmployeeData emp = new EmployeeData();
		emp.setEMail(eMail);
		emp.setName(name);
		emp.setLoc(loc);
		emp.setDept(dept);
		emp.setContact(contact);
		
		databaseConnection dc = new databaseConnection();
		
		Session session = dc.getConnection();
		
		
		
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
		
		session.close();
		
		
	};

}
