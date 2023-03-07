package com.example.app.survey2;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Survey2Form {
	
	@Min(0)
	@Max(200)
	private int age;
	
	@Min(1)
	@Max(5)
	private int satisfaction;
	
	@Size(min = 1, max = 200)
	@NotNull
	private String comment;
}
