package com.avinashit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.avinashit.entity.Specialization;
import com.avinashit.services.ISpecializationService;

@Controller
@RequestMapping("/spec")
public class SpecializationController {

	@Autowired
	private ISpecializationService specializationService;

	@GetMapping("/register")
	public String getSpecialization() {
		return "specializationRegistration";

	}

	@PostMapping("/save")
	public String saveSpecialization(@ModelAttribute Specialization specialization, Model model) {
		Long id = specializationService.saveSpecialization(specialization);
		String message = "SPECIALIZATION  " + id + "  CREATED";
		model.addAttribute("message", message);
		return "specializationRegistration";
	}

}
