package com.VAANI.dao;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
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
	
	public List viewDisabledUser(){
		List ls=new ArrayList();
		try
		{	
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			Query q=session.createQuery("from DisabledUserVO where deleteStatus='active'");
			
			ls=q.list();
			
			transaction.commit();
			
			session.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return ls;
	}
	
	public List edit(DisabledUserVO disabledUserVO1)
	{
		List ls=new ArrayList();
		try
		{
			
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			Query q=session.createQuery("from DisabledUserVO where id='"+disabledUserVO1.getDisabledUserId()+"'");
			
			ls=q.list();
			
			transaction.commit();
			
			session.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return ls;
	}
	public void update(DisabledUserVO disabledUserVO2)
	{
		try
		{	
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			session.update(disabledUserVO2);
			
			transaction.commit();
			
			session.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void delete(DisabledUserVO disabledUserVO3)
	{
		try
		{
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			Query q=session.createQuery("update DisabledUserVO set deleteStatus='inactive' where disabledUserId='"+disabledUserVO3.getDisabledUserId()+"'");
			
			q.executeUpdate();
			
			transaction.commit();
			
			session.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
