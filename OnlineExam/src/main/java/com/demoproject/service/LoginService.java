package com.demoproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoproject.dao.LoginDao;
import com.demoproject.entity.User;

@Service
public class LoginService {

	@Autowired
	LoginDao dao;

	public boolean validate(User user) {
		String dbpassword = dao.getPassword(user.getUsername());

		if (dbpassword == null) {
			return false;
		}
		if (dbpassword.equals(user.getPassword())) {
			return true;
		} else {
			return false;
		}
	}

}
