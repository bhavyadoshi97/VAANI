package com.VAANI.service;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VAANI.dao.*;
import com.VAANI.model.*;

@Service
public class DisabledUserService {
	
	@Autowired
	DisabledUserDAO disabledUserDAO;
	
	@Transactional
	public void insertDisabledUser(DisabledUserVO disabledUserVO)
	{
		disabledUserDAO.insertDisabledUser(disabledUserVO);
	}

}
