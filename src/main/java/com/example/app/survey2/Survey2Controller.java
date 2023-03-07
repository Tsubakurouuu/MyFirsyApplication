package com.example.app.survey2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/survey2")
public class Survey2Controller {
	
	@GetMapping("/form")
	public String form(Survey2Form survey2Form, Model model, @ModelAttribute("complete") String complete) {
		model.addAttribute("title", "Survey2 Form");
		return "survey2/form";
	}
	
	@PostMapping("/form")
	public String formGoBack(Survey2Form survey2Form, Model model) {
		model.addAttribute("title", "Survey2 Form");
		return "survey2/form";
	}
	
	@PostMapping("/confirm")
	public String confirm(@Validated Survey2Form survey2Form, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("title", "Survey2 Form");
			return "survey2/form";
		}
		model.addAttribute("title", "Confirm Page");
		return "survey2/confirm";
	}
	
	@PostMapping("/complete")
	public String complete(@Validated Survey2Form survey2Form, BindingResult result, Model model, RedirectAttributes redirectAttributes) {
		if(result.hasErrors()) {
			model.addAttribute("title", "Survey2 Form");
			return "survey2/form";
		}
		redirectAttributes.addFlashAttribute("complete", "Registerd");
		return "redirect:/survey2/form";
	}
}
