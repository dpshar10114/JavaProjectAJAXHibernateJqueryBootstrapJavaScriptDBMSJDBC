package com.newgen;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;




@WebServlet("/ActionServlet")
public class ActionServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) 
			throws ServletException, IOException  {
		
			
		
		String loginID = request.getParameter("eMail");
		
		
		
		
		//databaseConnection dc = new databaseConnection();
    	
		//Session session = dc.getConnection();
		Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");
        ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(sr);
        Session session = sf.openSession();
        
		
		session.beginTransaction();
		
		
		SQLQuery query = session.createSQLQuery("select eMail from login");
		
		List<String> li = query.list();
		
		session.getTransaction().commit();
		
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		
		//out.println(str);
		
		for(String ele: li) {
			
				//out.println(ele);
				//out.println(str);
			
			if(ele.equals(loginID)) {
				
				out.println("true");
			}
			
			
		}
		
		
		
		
	}

}
