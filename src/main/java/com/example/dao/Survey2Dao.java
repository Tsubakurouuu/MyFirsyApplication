package com.example.dao;

import java.util.List;

import com.example.entity.Survey2;

public interface Survey2Dao {
	
	void insertSurvey(Survey2 survey2);
		
	List<Survey2> getAll();
}
