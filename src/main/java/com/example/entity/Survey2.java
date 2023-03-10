package com.example.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Survey2 {
	private int id;
	private int age;
	private int satisfaction;
	private String comment;
	private LocalDateTime created;
}
