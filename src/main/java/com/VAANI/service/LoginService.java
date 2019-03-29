package com.VAANI.service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
	
	public String createMd5(String msg)
	{
		try
		{
			// Static getInstance method is called with hashing MD5 
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            // digest() method is called to calculate message digest 
            //  of an input digest() return array of byte 
            byte[] messageDigest = md.digest(msg.getBytes());
            
            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, messageDigest);
            
            // Convert message digest into hex value 
            String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
            return hashtext;
		}
		catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        }
	}
	
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
