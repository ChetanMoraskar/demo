package com.demoproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {

	
	@Id
	private String username;

	@Column
	private	String password;
	private	String mobilenumber;
	private	String emailid;
	private	String dateofbirth;

	public Users(String username, String password, String mobilenumber, String emailid, String dateofbirth) {
		super();
		this.username = username;
		this.password = password;
		this.mobilenumber = mobilenumber;
		this.emailid = emailid;
		this.dateofbirth = dateofbirth;
	}

	public Users() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + ", mobilenumber=" + mobilenumber
				+ ", emailid=" + emailid + ", dateofbirth=" + dateofbirth + "]";
	}

}
