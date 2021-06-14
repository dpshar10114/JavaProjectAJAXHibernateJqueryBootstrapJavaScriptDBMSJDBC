package com.newgen;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newgen.employeeDataDAO.employeeDataDAO;


import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import java.io.*;


@WebServlet("/DemoServelet")
public class DemoServelet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) 
			throws ServletException, IOException  {
		
		try{
			employeeDataDAO emp = new employeeDataDAO();
		
			emp.storeDataDB(request);
			resp.sendRedirect("/newgenform/thankyou.jsp");
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		//mycode
		
		
		
	}

}



