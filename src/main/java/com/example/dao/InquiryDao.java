package com.example.dao;

import java.util.List;

import com.example.entity.Inquiry;

public interface InquiryDao {
	
	void insertInquiry(Inquiry inquiry);
	
	int updateInquiry(Inquiry inquiry);
	
	List<Inquiry> getAll();
}
