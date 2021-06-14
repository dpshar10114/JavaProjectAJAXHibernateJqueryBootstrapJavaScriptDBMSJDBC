package com.newgen.form;


import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="EmployeeDataNew")

public class EmployeeData {
	
	@Id
	private String eMail;
	private String name;
	private String loc;
	private String dept;
	private String contact;
	
	
	
	public String getEMail() {
		return eMail;
	}
	public void setEMail(String eMail) {
		this.eMail = eMail;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	@Override
	public String toString() {
		return "EmployeeData [EMail=" + eMail + ", Name=" + name + ", Location=" + loc + "Department=" + dept + "Contact=" + contact +"]";
	}
	

}
