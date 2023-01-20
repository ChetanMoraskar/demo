package com.demoproject.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demoproject.entity.Questions;

@Controller
public class QuestionManagmentController {

	@Autowired
	SessionFactory sessionFactory;

	@RequestMapping("addQuestion")
	public ModelAndView addQuestion(Questions question) {

		Session session = sessionFactory.openSession();
		session.save(question);
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.close();

		ModelAndView modelAndview = new ModelAndView();
		modelAndview.setViewName("questionmanagment");
	//	modelAndview.addObject("message", "Question Added Sucessfully");

		return modelAndview;
	}
}
