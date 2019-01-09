package com.VAANI.controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.VAANI.model.*;
import com.VAANI.service.*;


@Controller
public class DisabledUserController {
	
	@Autowired
	DisabledUserService disabledUserService;
	
	@RequestMapping(value="/addDisabledUser.html",method=RequestMethod.GET)
	public ModelAndView loadaddDisabledUser()
	{
		return new ModelAndView("addDisabledUser","disabledUserData",new DisabledUserVO());
	}
	
	@RequestMapping(value="/insertDisabledUser.html",method=RequestMethod.POST)
	public ModelAndView insertDisabledUser(DisabledUserVO disabledUserVO)
	{
		this.disabledUserService.insertDisabledUser(disabledUserVO);
		return new ModelAndView("redirect:/addDisabledUser.html");
	}
}