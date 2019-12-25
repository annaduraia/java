package com.jcg.examples.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jcg.examples.delegate.LoginDelegate;
import com.jcg.examples.delegate.RegistrationDelicate;
import com.jcg.examples.viewBean.LoginBean;
import com.jcg.examples.viewBean.RegistrationBean;

import utill.CustomException;


@Controller
public class LoginController
{
		@Autowired
		private LoginDelegate loginDelegate;

		@Autowired
		private RegistrationDelicate registrationDelicate;
		
		@RequestMapping(value="/registration", method=RequestMethod.GET)
		public ModelAndView registration(HttpServletRequest request, HttpServletResponse response, RegistrationBean registrationBean)
		{
			ModelAndView model = new ModelAndView("registration");
			model.addObject("registrationBean",registrationBean);
			return model;
		}
		
		@RequestMapping(value="/registrationBean",method=RequestMethod.POST)
		public ModelAndView executeRegistration(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("registrationBean")RegistrationBean registrationBean)
		{
			ModelAndView model= null;
			try
			{
					boolean isValidUser = registrationDelicate.saveUser(registrationBean.getFirstName(), registrationBean.getLastName(),registrationBean.getAddress(),registrationBean.getAge());
					if(isValidUser)
					{
						/*	System.out.println("User Login Successful");
							request.setAttribute("loggedInUser", registrationBean.getUsername());
							model = new ModelAndView("welcome");*/
					}
					/*else
					{
							model = new ModelAndView("login");
							request.setAttribute("message", "Invalid credentials!!");
					}*/
			}
			catch(Exception e)
			{
					e.printStackTrace();
			}

			return model;
		}
		
		@RequestMapping(value="/login",method=RequestMethod.GET)
		public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response, LoginBean loginBean)
		{
			ModelAndView model = new ModelAndView("login");
			//LoginBean loginBean = new LoginBean();
			model.addObject("loginBean", loginBean);
			return model;
		}
		
		@ExceptionHandler(CustomException.class)
		@RequestMapping(value="/login",method=RequestMethod.POST)
		public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("loginBean")LoginBean loginBean)
		{
				ModelAndView model= null;
				try
				{
						boolean isValidUser = loginDelegate.isValidUser(loginBean.getUsername(), loginBean.getPassword());
						if(isValidUser)
						{
								System.out.println("User Login Successful");
								request.setAttribute("loggedInUser", loginBean.getUsername());
								model = new ModelAndView("welcome");
						}
						else
						{
								model = new ModelAndView("login");
								request.setAttribute("message", "Invalid credentials!!");
						}
				}
				catch(Exception e)
				{
						e.printStackTrace();
				}

				return model;
		}
}
