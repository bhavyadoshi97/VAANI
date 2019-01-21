package com.VAANI.dao;

import java.util.List;

import com.VAANI.model.DisabledUserVO;

public interface DisabledUserDAO {
	
	public void insertDisabledUser(DisabledUserVO disabledUserVO);
	public List viewDisabledUser();
	public List edit(DisabledUserVO disabledUserVO1);
	public void update(DisabledUserVO disabledUserVO2);
	public void delete(DisabledUserVO disabledUserVO3);
}
