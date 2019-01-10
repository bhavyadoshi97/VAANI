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
public class QuestionDAOImp implements QuestionDAO{
	@Autowired
	SessionFactory sessionFactory;

	public void insertQuestion(QuestionVO questionVO)
	{
		try
			{
				 Session session=sessionFactory.openSession();
				 Transaction transaction=session.beginTransaction();
				 session.save(questionVO);
				 transaction.commit();
				 session.close();
			}
		catch(Exception ex)
			{
				ex.printStackTrace();
			} 
	}
	public List viewQuestion()
	{
		List ls=new ArrayList();
		try
		{	
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			Query q=session.createQuery("from QuestionVO where deleteStatus='active'");
			
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
	public List edit(QuestionVO questionVO1)
	{
		List ls=new ArrayList();
		try
		{
			
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			Query q=session.createQuery("from QuestionVO where id='"+questionVO1.getQuestionId()+"'");
			
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
	public void update(QuestionVO questionVO2)
	{
		try
		{	
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			session.update(questionVO2);
			
			transaction.commit();
			
			session.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void delete(QuestionVO questionVO3)
	{
		try
		{
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			Query q=session.createQuery("update QuestionVO set deleteStatus='inactive' where questionId='"+questionVO3.getQuestionId()+"'");
			
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