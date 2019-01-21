package com.VAANI.service;
import java.util.List;

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
	
	@Transactional
	public List viewDisabledUser(){
		List viewDisabledUserLs=disabledUserDAO.viewDisabledUser();
		return viewDisabledUserLs;
	}

	public List edit(DisabledUserVO disabledUserVO1) {
		List editDisabledUserLs=disabledUserDAO.edit(disabledUserVO1);
		return editDisabledUserLs;
	}

	public void update(DisabledUserVO disabledUserVO2) {
		disabledUserDAO.update(disabledUserVO2);
		
	}

	public void delete(DisabledUserVO disabledUserVO3) {
		disabledUserDAO.delete(disabledUserVO3);
		
	}

}
