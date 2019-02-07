package com.VAANI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MenuController {
	
	@RequestMapping(value="/admin/index.html")
	public ModelAndView loadHome()
	{
		return new ModelAndView("admin/index");
	}
	
	@RequestMapping(value="/admin/viewReport.html")
	public ModelAndView loadviewReport()
	{
		return new ModelAndView("admin/viewReport");
	}
	
	@RequestMapping(value="/admin/userManager.html",method=RequestMethod.GET)
	public ModelAndView loaduserManager()
	{
		return new ModelAndView("admin/userManager");
	}
	
	@RequestMapping(value="/admin/uploadDataset.html")
	public ModelAndView loaduploadDataset()
	{
		return new ModelAndView("admin/uploadDataset");
	}
	
	@RequestMapping(value="/admin/viewFeedback.html")
	public ModelAndView loadviewFeedback()
	{
		return new ModelAndView("admin/viewFeedback");
	}
	
	@RequestMapping(value="/admin/outputScreen.html")
	public ModelAndView loadoutputScreen()
	{
		return new ModelAndView("admin/outputScreen");
	}
}
