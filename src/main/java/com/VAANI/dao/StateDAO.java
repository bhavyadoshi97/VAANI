package com.VAANI.dao;

import java.util.List;

import com.VAANI.model.StateVO;

public interface StateDAO {
	
	public void insertState(StateVO stateVO);
	public List viewState();
	public List edit(StateVO stateVO1);
	public void update(StateVO stateVO2);
	public void delete(StateVO stateVO3);

}
