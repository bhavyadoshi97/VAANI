package com.VAANI.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VAANI.dao.QuestionDAO;
import com.VAANI.model.QuestionVO;

@Service
public class QuestionService {
	
	@Autowired
	QuestionDAO questionDAO;
	
	@Transactional
	public void insertQuestion(QuestionVO questionVO){
		
		questionDAO.insertQuestion(questionVO);
	}
	
	@Transactional
	public List viewQuestion()
	{
		List viewQuestionLs= questionDAO.viewQuestion();
		return viewQuestionLs;
	}
	@Transactional
	public List edit(QuestionVO questionVO1) {
		
		List editStateLs=questionDAO.edit(questionVO1);
		return editStateLs;
		
	}

	@Transactional
	public void update(QuestionVO questionVO2) {
		
		questionDAO.update(questionVO2);
		
	}

	@Transactional
	public void delete(QuestionVO questionVO3) {
		
		questionDAO.delete(questionVO3);
		
	}

}
