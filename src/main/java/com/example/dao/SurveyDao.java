package com.example.dao;

import java.util.List;

import com.example.entity.Survey;

public interface SurveyDao {
	
	void insertSurvey(Survey survey);
	
	List<Survey> getAll();
}
