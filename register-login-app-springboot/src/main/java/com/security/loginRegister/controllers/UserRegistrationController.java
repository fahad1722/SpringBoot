package com.security.loginRegister.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.security.loginRegister.controllers.dto.UserRegistrationDto;
import com.security.loginRegister.services.UserService;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	private final UserService userService;

	public UserRegistrationController(UserService userService) {
		this.userService = userService;
	}

	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}

	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}

	@GetMapping
	public String showRegistrationForm() {

		return "registration";
	}
}
