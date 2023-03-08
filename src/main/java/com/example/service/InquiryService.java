package com.example.service;

import java.util.List;

import com.example.entity.Inquiry;

public interface InquiryService {
	
	void save(Inquiry inquiry);
	
	List<Inquiry> getAll();
}
