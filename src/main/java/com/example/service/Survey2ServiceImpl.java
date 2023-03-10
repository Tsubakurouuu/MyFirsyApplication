package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.Survey2Dao;
import com.example.entity.Survey2;

@Service
public class Survey2ServiceImpl implements Survey2Service {
	
	private final Survey2Dao dao;
	
	@Autowired
	public Survey2ServiceImpl(Survey2Dao dao) {
		this.dao = dao;
	}
	
	@Override
	public void save(Survey2 survey2) {
		dao.insertSurvey(survey2);
	}

	@Override
	public List<Survey2> getAll() {
		return dao.getAll();
	}

}
