package com.VAANI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.VAANI.model.StateVO;
import com.VAANI.service.StateService;

@Controller
public class UserStateController {
	
	@Autowired
	StateService stateService;
	
	@RequestMapping(value="/user/addState.html")
	public ModelAndView loadaddState()
	{
		return new ModelAndView("user/addState","stateData",new StateVO());
	}
	
	@RequestMapping(value="/user/insertState.html",method=RequestMethod.POST)
	public ModelAndView insertState(@ModelAttribute StateVO stateVO)
	{
		this.stateService.insertState(stateVO);
		return new ModelAndView("redirect:/user/viewState.html");
	}
	
	@RequestMapping(value="/user/viewState.html")
	public ModelAndView loadviewState()
	{
		List viewStateList=this.stateService.viewState();
		return new ModelAndView("user/viewState","statelist",viewStateList);
	}
	
	@RequestMapping(value="/user/editState.html")
	public ModelAndView loadeditState(@RequestParam("editStateId") int editStateId,StateVO stateVO1)
	{
		stateVO1.setStateId(editStateId);
		List editStateList=this.stateService.edit(stateVO1);
		return new ModelAndView("user/editState","editData",(StateVO)editStateList.get(0));
	}
	
	@RequestMapping(value="/user/updateState.html")
	public ModelAndView updateState(@ModelAttribute("editData") StateVO stateVO2)
	{
		this.stateService.update(stateVO2);
		return new ModelAndView("redirect:/user/viewState.html");
	}
	
	@RequestMapping(value="/user/deleteState.html")
	public ModelAndView deleteState(@RequestParam("deleteStateId") int deleteStateId, StateVO stateVO3)
	{
		stateVO3.setStateId(deleteStateId);
		this.stateService.delete(stateVO3);
		return new ModelAndView("redirect:/user/viewState.html");
	}

}
