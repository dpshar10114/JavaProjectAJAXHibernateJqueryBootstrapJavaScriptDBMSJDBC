package com.newgen;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.newgen.form.RegisterData;
import com.newgen.services.Mailer;



@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) 
			throws ServletException, IOException  {
		
		String email = request.getParameter("email");
		String fname = request.getParameter("fname");
		String mname = request.getParameter("mname");
		String lname = request.getParameter("lname");
		String dob = request.getParameter("dob");
		String doj = request.getParameter("doj");
		String password = request.getParameter("pass");
		
		String name = fname+" "+mname+" "+ lname;
		
	
		//PrintWriter out = resp.getWriter();
		 /* 
		 * out.println(email); out.println(name); out.println(dob); out.println(doj);
		 * out.println(password);
		 * 
		 * out.close();
		 */
		
		RegisterData emp = new RegisterData();
		
		emp.setEmail(email);
		emp.setName(name);
		emp.setDob(dob);
		emp.setDoj(doj);
		emp.setPassword(password);
		
		Configuration con = new Configuration();
        con.configure().addAnnotatedClass(RegisterData.class);
        ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(sr);
        Session session1 = sf.openSession();
        session1.beginTransaction();
        
        session1.save(emp);
        
        session1.getTransaction().commit();
        
        session1.close();
        
        String to = request.getParameter("email");
    	
		String subject = "Newgen | Registration Successfull | "+name;
		String msg="Dear "+fname+",\n\nGreetings from Newgen Software Technologies Limited\n\nYour Registration on the Newgen Form Portal is successful."
				+ "\n\nYour Login Credentials are as follows:\n\n"
				+ "Login ID: "+email+"\n"
				+ "Password: "+password+"\n\n\n"
				+ "Please click on the following link to login to your account.\n\n"
				+ "https://localhost:8080/newgenform/\n\n\n"
				+ "Regards,\n\n"
				+ "Hardik Agarwal\n"
				+ "Software Engineer(T)\n"
				+ "Product Engineering Services\n"
				+ "Newgen Software Technologies Limited";
		Mailer.send(to,subject,msg);
		
		
		resp.sendRedirect("/newgenform/thankyou.jsp");
		
           
        //resp.sendRedirect("/newgenform/EmailUtility");
		
		
	}

}
