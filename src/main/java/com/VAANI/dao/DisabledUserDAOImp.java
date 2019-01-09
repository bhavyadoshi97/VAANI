package com.VAANI.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.VAANI.model.*;


@Repository
public class DisabledUserDAOImp implements DisabledUserDAO{
	@Autowired
	SessionFactory sessionFactory;

	public void insertDisabledUser(DisabledUserVO disabledUserVO){
		try
		{
			 Session session=sessionFactory.openSession();
			 Transaction transaction=session.beginTransaction();
			 session.save(disabledUserVO);
			 transaction.commit();
			 session.close();
		}
	catch(Exception ex)
		{
			ex.printStackTrace();
		} 
	}
}
