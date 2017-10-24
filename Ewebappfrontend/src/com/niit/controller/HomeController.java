package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.backendDAO.productDAO;

@Controller
public class HomeController {
	
	
	@Autowired
	private productDAO productdao;
	
	@RequestMapping(value= {"/","header"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickAboutUs",true);
		return mv;
	}
	//@RequestMapping(value= {"/","header"})
	public ModelAndView Home()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome",true);
		return mv;
	}
	//@RequestMapping(value= {"/","header"})
	public ModelAndView Login()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "login");
		mv.addObject("userClickLogin",true);
		return mv;
	}
	public ModelAndView Submit()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "submit");
		mv.addObject("userClicksubmit",true);
		return mv;
	}
	

}
