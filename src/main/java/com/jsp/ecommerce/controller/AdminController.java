package com.jsp.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.jsp.ecommerce.dto.UserDto;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@GetMapping("/register")
	public String loadRegister(UserDto userDto, Model model) {
		model.addAttribute("adminDto", userDto);
		return "admin-register.html";
	}
	
	@PostMapping("/register")
	public String register(@Valid UserDto userDto,BindingResult result) {
		if (result.hasErrors()) {
			return "admin-register.html";
		}
		return "redirect:/";
	}

}


