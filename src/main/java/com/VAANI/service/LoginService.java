package com.VAANI.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VAANI.dao.*;
import com.VAANI.model.*;

@Service
public class LoginService {
	
	@Autowired
	LoginDAO loginDAO;
	
	public void loginInsert(LoginVO loginVO){
		this.loginDAO.insertLogin(loginVO);
	}
}
