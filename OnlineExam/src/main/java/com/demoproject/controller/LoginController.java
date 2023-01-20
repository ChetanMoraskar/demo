package com.demoproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demoproject.entity.User;
import com.demoproject.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	LoginService service;

	@GetMapping("/RegisterNow")
	public String showRegisterPage() {
		return "registration";
	}
	
	
	
	@RequestMapping("login")
	public ModelAndView login(User user, HttpServletRequest request) {

		ModelAndView modelAndview = new ModelAndView();
		if (user.getUsername().equals("admin") && user.getPassword().equals("admin123")) 
		{
			modelAndview.setViewName("questionmanagment");
		}
		  else if (service.validate(user)) 
		{
			modelAndview.setViewName("startexam");
			modelAndview.addObject("message", "Welcome " + user.getUsername());
			HttpSession session=request.getSession();
			session.setAttribute("username", user.getUsername());

		} else 
		{
			modelAndview.setViewName("login");
			modelAndview.addObject("errormessage", "Wrong Password");
		}

		return modelAndview;
	}

}
