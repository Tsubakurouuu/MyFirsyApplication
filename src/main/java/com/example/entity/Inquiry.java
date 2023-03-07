package com.example.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inquiry {
	private int id;
	private String name;
	private String Email;
	private String contents;
	private LocalDateTime created;
}
