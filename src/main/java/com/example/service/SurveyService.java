package com.example.service;

import java.util.List;

import com.example.entity.Survey;

public interface SurveyService {
	
	void save(Survey survey);
	
	List<Survey> getAll();
}
