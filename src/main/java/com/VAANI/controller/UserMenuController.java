package com.VAANI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserMenuController {
	
	@RequestMapping(value="/user/index.html")
	public ModelAndView loadHome()
	{
		return new ModelAndView("user/index");
	}
	
	@RequestMapping(value="/user/viewReport.html")
	public ModelAndView loadviewReport()
	{
		return new ModelAndView("user/viewReport");
	}
	
	@RequestMapping(value="/user/userManager.html",method=RequestMethod.GET)
	public ModelAndView loaduserManager()
	{
		return new ModelAndView("user/userManager");
	}
	
	@RequestMapping(value="/user/uploadDataset.html")
	public ModelAndView loaduploadDataset()
	{
		return new ModelAndView("user/uploadDataset");
	}
	
	@RequestMapping(value="/user/viewFeedback.html")
	public ModelAndView loadviewFeedback()
	{
		return new ModelAndView("user/viewFeedback");
	}
	
	@RequestMapping(value="/user/outputScreen.html")
	public ModelAndView loadoutputScreen()
	{
		return new ModelAndView("user/outputScreen");
	}

}
