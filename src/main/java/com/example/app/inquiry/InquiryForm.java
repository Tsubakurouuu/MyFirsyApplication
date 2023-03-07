package com.example.app.inquiry;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InquiryForm {
	
	@Size(min = 1, max = 20, message = "Plaese input 20characters or less.")
	private String name;
	
	@NotNull
	@Email(message = "Invalid E-mail Format")
	private String email;
	
	@NotNull
	private String contents;
}
