package com.demoproject.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demoproject.entity.Users;

@Controller
public class RegistrationController {

	@Autowired
	SessionFactory sessionFactory;

	
	
	@GetMapping("/")
	public String Home() {
		System.out.println("inside home");
		return "login";
	}	
	
	
	
	
	@RequestMapping("/register")
	public ModelAndView register(Users user) {
		System.out.println(user);
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();

		ModelAndView modelAndview = new ModelAndView();
		modelAndview.setViewName("login");
		modelAndview.addObject("messege", "Registration Sucessfull");
		return modelAndview;

	}
}
