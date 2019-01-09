package com.VAANI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MenuController {
	
	@RequestMapping(value="/home.html")
	public ModelAndView loadHome()
	{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/viewReport.html")
	public ModelAndView loadviewReport()
	{
		return new ModelAndView("viewReport");
	}
	
	@RequestMapping(value="/userManager.html",method=RequestMethod.GET)
	public ModelAndView loaduserManager()
	{
		return new ModelAndView("userManager");
	}
	
	@RequestMapping(value="/uploadDataset.html")
	public ModelAndView loaduploadDataset()
	{
		return new ModelAndView("uploadDataset");
	}
	
	@RequestMapping(value="/viewFeedback.html")
	public ModelAndView loadviewFeedback()
	{
		return new ModelAndView("viewFeedback");
	}
	
	@RequestMapping(value="/outputScreen.html")
	public ModelAndView loadoutputScreen()
	{
		return new ModelAndView("outputScreen");
	}
}
