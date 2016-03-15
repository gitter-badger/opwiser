package com.fireflieslive.opwiser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Opwiser");
		model.addAttribute("tagline", "live it wise");

		return "welcome";
	}
}