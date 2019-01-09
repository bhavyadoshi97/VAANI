package com.VAANI.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VAANI.dao.*;
import com.VAANI.model.*;

@Service
public class QuestionService {
	
	@Autowired
	QuestionDAO questionDAO;
	
	@Transactional
	public void insertQuestion(QuestionVO questionVO){
		
		questionDAO.insertQuestion(questionVO);
	}

}
