package com.VAANI.service;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VAANI.dao.*;
import com.VAANI.model.*;

import java.util.List;

@Service
public class StateService {
	
	@Autowired
	StateDAO stateDAO;

	@Transactional
	public void insertState(StateVO stateVO) {
		
		stateDAO.insertState(stateVO);
	}

	@Transactional
	public List viewState() {
		
		List viewStateLs=stateDAO.viewState();
		return viewStateLs;
	}

	@Transactional
	public List edit(StateVO stateVO1) {
		
		List editStateLs=stateDAO.edit(stateVO1);
		return editStateLs;
		
	}

	@Transactional
	public void update(StateVO stateVO2) {
		
		stateDAO.update(stateVO2);
		
	}

	@Transactional
	public void delete(StateVO stateVO3) {
		
		stateDAO.delete(stateVO3);
		
	}

}
