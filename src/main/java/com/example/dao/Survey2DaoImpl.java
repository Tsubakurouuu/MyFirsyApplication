package com.example.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.entity.Survey2;

@Repository
public class Survey2DaoImpl implements Survey2Dao {
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public Survey2DaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertSurvey(Survey2 survey2) {
		jdbcTemplate.update("INSERT INTO survey2(age, satisfaction, comment, created) VALUES(?, ?, ?, ?)",
				survey2.getAge(), survey2.getSatisfaction(), survey2.getComment(), survey2.getCreated());
	}

	@Override
	public List<Survey2> getAll() {
		String sql = "SELECT id, age, satisfaction, comment, created FROM survey2";
		List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);
		List<Survey2> list = new ArrayList<Survey2>();
		for(Map<String, Object> result : resultList) {
			Survey2 survey2 = new Survey2();
			survey2.setId((int)result.get("id"));
			survey2.setAge((int)result.get("age"));
			survey2.setSatisfaction((int)result.get("satisfaction"));
			survey2.setComment((String)result.get("comment"));
			survey2.setCreated(((Timestamp)result.get("created")).toLocalDateTime());
			list.add(survey2);
		}
		return list;
	}

}
