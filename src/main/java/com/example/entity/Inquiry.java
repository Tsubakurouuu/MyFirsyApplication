package com.example.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Inquiry {
	private int id;
	private String name;
	private String Email;
	private String contents;
	private LocalDateTime created;
	public Inquiry() {
		
	}
}
