package com.VAANI.service;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VAANI.dao.*;
import com.VAANI.model.CityVO;

import java.util.List;

@Service
public class CityService {
	
	@Autowired
	CityDAO cityDAO;

	@Transactional
	public void insertCity(CityVO cityVO) {
		
		cityDAO.insertCity(cityVO);
	}

	@Transactional
	public List viewCity() {
		
		List viewCityLs=cityDAO.viewCity();
		return viewCityLs;
	}

	@Transactional
	public List edit(CityVO cityVO1) {
		
		List editCityLs=cityDAO.edit(cityVO1);
		return editCityLs;
	}

	@Transactional
	public void update(CityVO cityVO2) {
		
		cityDAO.update(cityVO2);
		
	}

	@Transactional
	public void delete(CityVO cityVO3) {
		
		cityDAO.delete(cityVO3);
		
	}

}
