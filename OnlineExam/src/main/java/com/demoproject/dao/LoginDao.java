package com.demoproject.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demoproject.entity.Users;

@Repository
public class LoginDao {

	@Autowired
	SessionFactory sessionFactory;

	public String getPassword(String username) {
		Session session = sessionFactory.openSession();
		Users user = session.get(Users.class, username);
		if (user == null)
			return null;

		else

			return user.getPassword();
	}
}
