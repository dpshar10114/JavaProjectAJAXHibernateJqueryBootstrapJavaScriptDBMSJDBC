package com.newgen.common;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.newgen.form.EmployeeData;




public class databaseConnection {
	
	public Session getConnection() {
		
		Configuration con = new Configuration();
        con.configure().addAnnotatedClass(EmployeeData.class);
        ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(sr);
        Session session1 = sf.openSession();
        
        return session1;
		
	}

}
