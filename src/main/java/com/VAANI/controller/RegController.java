package com.VAANI.controller;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.VAANI.model.LoginVO;
import com.VAANI.model.RegVO;
import com.VAANI.service.LoginService;
import com.VAANI.service.RegService;

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
    	
    	@RequestMapping(value="/insertData.html",method=RequestMethod.POST)
    	public ModelAndView insertData(@ModelAttribute RegVO regVO, LoginVO loginVO)
    		{	
    			loginVO.setUsername(regVO.getLoginVO().getUsername());
    			loginVO.setPassword(regVO.getLoginVO().getPassword());
    			loginVO.setEnabled(1);
    			loginVO.setRole("ROLE_USER");
    			this.loginService.loginInsert(loginVO);
    			regVO.setLoginVO(loginVO);
    			this.regService.insertRegister(regVO);
    			
    			return new ModelAndView("redirect:/login");
    		}
    	
    	@RequestMapping(value="/checkUser.html",method=RequestMethod.POST)
    	public ModelAndView checkUser(@RequestParam("username") String checkuser,LoginVO loginVO)
    	{
    		loginVO.setUsername(checkuser);
    		List<LoginVO> checkUserLs=new ArrayList<LoginVO>();
    		checkUserLs=this.loginService.checkUser(loginVO);
    		Boolean reply;
    		if(checkUserLs.isEmpty())
    		{
    			System.out.print("Username not found");
    			reply=true;
    		}
    		else 
    		{
    			System.out.print("Username already exist!!");
    			reply=false;
    		}
    		return new ModelAndView("checkUsername","response",reply);
    	}
	
	@RequestMapping(value = "/admin/index", method = RequestMethod.GET, headers = "Accept=application/json")
	public ModelAndView loadAdminIndex(HttpServletRequest request)
	{
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String userName = user.getUsername();
		HttpSession session=request.getSession();
		session.setAttribute("un", userName);
		
		return new ModelAndView("/admin/index","uname",userName);
	}
	@RequestMapping(value = "/user/index", method = RequestMethod.GET, headers = "Accept=application/json")
	public ModelAndView loadUserIndex(HttpServletRequest request)
	{
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String userName = user.getUsername();
		HttpSession session=request.getSession();
		session.setAttribute("un", userName);
		return new ModelAndView("/user/index","uname",userName);
	}
	/*@RequestMapping(value = "/login.html", method = RequestMethod.GET)
	public ModelAndView loadLogin3() {

		return new ModelAndView("login");
	}*/
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView loadLogin2()
	{
		return new ModelAndView("redirect:/login");
	}
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public ModelAndView loadLogin()
	{
		return new ModelAndView("login");
	}
	@RequestMapping(value = "/user/logout", method = {RequestMethod.POST, RequestMethod.GET})	
	public ModelAndView viewUserDetails(ModelMap model,HttpServletResponse response,HttpServletRequest request) {

		  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	        if (auth != null) {
	            new SecurityContextLogoutHandler().logout(request, response, auth);
	            request.getSession().invalidate();
	            request.getSession().setAttribute("tempStatus", "success");
	            request.getSession().setAttribute("statusText", "User Logout Successfull!");
	}
	        return new ModelAndView("redirect:/login");
	        }
	@RequestMapping(value = "/admin/logout", method = {RequestMethod.POST, RequestMethod.GET})	
	public ModelAndView viewAdminDetails(ModelMap model,HttpServletResponse response,HttpServletRequest request) {

		  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	        if (auth != null) {
	            new SecurityContextLogoutHandler().logout(request, response, auth);
	            request.getSession().invalidate();
	            request.getSession().setAttribute("tempStatus", "success");
	            request.getSession().setAttribute("statusText", "Admin Logout Successfull!");
	}
	        return new ModelAndView("redirect:/login");
	        }
}	

    	
