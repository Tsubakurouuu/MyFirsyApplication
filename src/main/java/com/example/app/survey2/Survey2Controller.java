package com.example.app.survey2;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.entity.Survey2;
import com.example.service.Survey2Service;

@Controller
@RequestMapping("/survey2")
public class Survey2Controller {
	
	private final Survey2Service survey2Service;
	
	@Autowired
	public Survey2Controller(Survey2Service survey2Service) {
		this.survey2Service = survey2Service;
	}
	
	@GetMapping
	public String index(Model model) {
		List<Survey2> list = survey2Service.getAll();
		model.addAttribute("survey2List", list);
		model.addAttribute("title", "Survey2 Index");
		
		return "survey2/form";
	}
	
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
		Survey2 survey2 = new Survey2();
		survey2.setAge(survey2Form.getAge());
		survey2.setSatisfaction(survey2Form.getSatisfaction());
		survey2.setComment(survey2Form.getComment());
		survey2.setCreated(LocalDateTime.now());
		
		survey2Service.save(survey2);
		redirectAttributes.addFlashAttribute("complete", "Registerd");
		return "redirect:/survey2/form";
	}
}
