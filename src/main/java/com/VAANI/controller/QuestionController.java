package com.VAANI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.VAANI.model.*;
import com.VAANI.service.*;

@Controller
public class QuestionController {
	@Autowired
	QuestionService questionService;

	@RequestMapping(value="/addQuestion.html")
	public ModelAndView loadaddQuestion()
	{
		return new ModelAndView("addQuestion","questionData",new QuestionVO());
	}

	@RequestMapping(value="/insertQuestion.html", method=RequestMethod.POST)
	public ModelAndView insertQuestion(@ModelAttribute QuestionVO questionVO)
	{
		this.questionService.insertQuestion(questionVO);
		return new ModelAndView("redirect:/addQuestion.html");
	}
}
