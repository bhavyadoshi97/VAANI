package com.VAANI.controller;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.VAANI.model.*;
import com.VAANI.service.*;



@Controller
public class CityController {
	
	@Autowired
	StateService stateService;
	
	@Autowired
	CityService cityService;
	
	@RequestMapping(value="/addCity.html")
	public ModelAndView loadaddCity()
	{
		List viewStateList1=this.stateService.viewState();
		return new ModelAndView("addCity","cityData",new CityVO()).addObject("statelist1", viewStateList1);
	}
	
	@RequestMapping(value="/insertCity.html")
	public ModelAndView insertCity(CityVO cityVO)
	{
		cityVO.setDeleteStatus("active");
		this.cityService.insertCity(cityVO);
		return new ModelAndView("redirect:/viewCity.html");
	}
	
	@RequestMapping(value="/viewCity.html")
	public ModelAndView loadviewCity()
	{
		List viewCityList=new ArrayList();
		viewCityList=this.cityService.viewCity();
		return new ModelAndView("viewCity","citylist", viewCityList);
	}
	
	@RequestMapping(value="/editCity.html")
	public ModelAndView loadeditState(@RequestParam("editCityId") int editCityId,CityVO cityVO1)
	{
		cityVO1.setCityId(editCityId);
		List editCityList=this.cityService.edit(cityVO1);
		return new ModelAndView("editCity","editcityData",(CityVO)editCityList.get(0)).addObject("statelist1",editCityList);
	}
	
	@RequestMapping(value="/updateCity.html")
	public ModelAndView updateCity(@ModelAttribute("editcityData") CityVO cityVO2)
	{
		this.cityService.update(cityVO2);
		return new ModelAndView("redirect:/viewCity.html");
	}
	
	@RequestMapping(value="/deleteCity.html")
	public ModelAndView deleteCity(@RequestParam("deleteCityId") int deleteCityId, CityVO cityVO3)
	{
		cityVO3.setCityId(deleteCityId);
		this.cityService.delete(cityVO3);
		return new ModelAndView("redirect:/viewCity.html");
	}
}
