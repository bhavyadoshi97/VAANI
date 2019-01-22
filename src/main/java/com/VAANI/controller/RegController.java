package com.VAANI.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.VAANI.model.*;
import com.VAANI.service.*;

@Controller
public class RegController
	{
    	@Autowired
		RegService regService;
    	
    	@Autowired
    	LoginService loginService;
    	
    	@RequestMapping(value="/loadRegister1.html",method=RequestMethod.GET)
    	public ModelAndView loadRegister1()
    		{
    			return new ModelAndView("register","regData",new RegVO());
    		}
    	
    	@RequestMapping(value="insertData.html",method=RequestMethod.POST)
    	public ModelAndView insertData(@ModelAttribute RegVO regVO)
    		{	
    			this.loginService.loginInsert(regVO.getLoginVO());
    			this.regService.insertRegister(regVO);
    			
    			return new ModelAndView("redirect:/index");
    		}
    	@RequestMapping(value="/loadHome.html",method=RequestMethod.POST)
    	public ModelAndView loadHome()
    	{
    		return new ModelAndView("home");
    	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET, headers = "Accept=application/json")
	public ModelAndView loadIndex()
	{
		return new ModelAndView("index");
	}
	@RequestMapping(value="/", method = RequestMethod.GET, headers = "Accept=application/json")
	public ModelAndView loadIndex2()
	{
		return new ModelAndView("redirect:/index");
	}
	
      }	

    	
