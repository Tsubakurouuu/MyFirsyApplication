package com.example.app.survey;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class SurveyForm {
	
	@Min(0)
	@Max(150)
	private int age;
	
	@Min(1)
	@Max(5)
	private int satisfaction;
	
	@Size(min = 1, max = 200)
	@NotNull
	private String comment;
}
