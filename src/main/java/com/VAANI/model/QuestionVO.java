package com.VAANI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="questionsTable")

public class QuestionVO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="questionId")
	private int questionId;

	@Column(name="question")
	private String question;

	@Column(name="questionDescription")
	private String questionDescription;

	@Column(name="deleteStatus")
	private String deleteStatus;
	
	public String getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(String deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getQuestionDescription() {
		return questionDescription;
	}

	public void setQuestionDescription(String questionDescription) {
		this.questionDescription = questionDescription;
	}
}