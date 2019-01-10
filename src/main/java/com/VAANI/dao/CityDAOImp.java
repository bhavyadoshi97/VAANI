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
public class CityDAOImp implements CityDAO{
	@Autowired
	SessionFactory sessionFactory;
	
	public void insertCity(CityVO cityVO)
	{
		try
			{
				 Session session=sessionFactory.openSession();
				 Transaction transaction=session.beginTransaction();
				 session.save(cityVO);
				 transaction.commit();
				 session.close();
			}
		catch(Exception ex)
			{
				ex.printStackTrace();
			} 
	}
	public List viewCity()
	{
		List ls=new ArrayList();
		try
		{	
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			Query q=session.createQuery("from CityVO where deleteStatus='active'");
			
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
	public List edit(CityVO cityVO1)
	{
		List ls=new ArrayList();
		try
		{
			
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			Query q=session.createQuery("from CityVO where id='"+cityVO1.getCityId()+"'");
			
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
	public void update(CityVO cityVO2)
	{
		try
		{	
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			session.update(cityVO2);
			
			transaction.commit();
			
			session.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void delete(CityVO cityVO3)
	{
		try
		{
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			Query q=session.createQuery("update CityVO set deleteStatus='inactive' where cityId='"+cityVO3.getCityId()+"'");
			
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
