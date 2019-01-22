package com.VAANI.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VAANI.dao.*;
import com.VAANI.model.*;

@Service
public class LoginService {
	
	@Autowired
	LoginDAO loginDAO;
	
	@Transactional
	public void loginInsert(LoginVO loginVO){
		this.loginDAO.insertLogin(loginVO);
	}
	
	@Transactional
	public List<LoginVO> checkUser(LoginVO loginVO){
		List<LoginVO> checkUserList=this.loginDAO.checkUser(loginVO);
		return checkUserList;
	}
}
