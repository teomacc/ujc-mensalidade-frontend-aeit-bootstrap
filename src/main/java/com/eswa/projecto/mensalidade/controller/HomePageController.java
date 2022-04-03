package com.eswa.projecto.mensalidade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
	@GetMapping("/")
	public String homePage() {
		return "/homePage";
	}
}
