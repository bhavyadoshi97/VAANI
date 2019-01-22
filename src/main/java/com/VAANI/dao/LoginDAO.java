package com.VAANI.dao;

import java.util.List;

import com.VAANI.model.LoginVO;
public interface LoginDAO {
	public void insertLogin(LoginVO loginVO);
	public List<LoginVO> checkUser(LoginVO loginVO);
}
