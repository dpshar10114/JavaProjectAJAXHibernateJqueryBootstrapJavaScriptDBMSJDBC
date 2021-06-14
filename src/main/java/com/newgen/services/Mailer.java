package com.newgen.services;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

;

public class Mailer {
	
	public static void send(String to,String subject,String msg) {
		final String user="newgenform@gmail.com";//change accordingly  
		final String pass="Papa@1234";  
		
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");    
        props.put("mail.smtp.socketFactory.class",    
                  "javax.net.ssl.SSLSocketFactory");    
        props.put("mail.smtp.auth", "true");    
        props.put("mail.smtp.port", "465");
        
        Session session = Session.getDefaultInstance(props,  
        		 new javax.mail.Authenticator() {  
        		  protected PasswordAuthentication getPasswordAuthentication() {  
        		   return new PasswordAuthentication(user,pass);  
        		   }  
        		});  
        try {  
        	 MimeMessage message = new MimeMessage(session);  
        	 message.setFrom(new InternetAddress(user));  
        	 message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
        	 message.setSubject(subject);  
        	 message.setText(msg);  
        	   
        	
        	 Transport.send(message);  
        	  
        	 
        	  
        	 } catch (MessagingException e) {  
        	    throw new RuntimeException(e);  
        	 } 
		
	}

}
