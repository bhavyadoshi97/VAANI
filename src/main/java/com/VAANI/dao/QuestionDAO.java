package com.VAANI.dao;

import java.util.List;

import com.VAANI.model.QuestionVO;

public interface QuestionDAO {
	
	public void insertQuestion(QuestionVO questionVO);
	public List viewQuestion();
	public List edit(QuestionVO questionVO1);
	public void update(QuestionVO questionVO2);
	public void delete(QuestionVO questionVO3);

}
