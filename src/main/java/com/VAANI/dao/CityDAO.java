package com.VAANI.dao;
import java.util.List;

import com.VAANI.model.*;

public interface CityDAO {
	
	public void insertCity(CityVO cityVO);
	public List viewCity();
	public List edit(CityVO cityVO1);
	public void update(CityVO cityVO2);
	public void delete(CityVO cityVO3);

}
