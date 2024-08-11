package com.security.loginApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/home")
	public String home() {
		return "<h1> WELCOME TO HOME PAGE </h1>";
	}

	@GetMapping("/balance")
	public String getBalance() {
		return "<h1> Current balance is : 1000 </h1>";
	}

	@GetMapping("/statement")
	public String getStatement() {
		return "<h1> Your statement is sent to the mail ID </h1>";
	}

	@GetMapping("/myloan")
	public String myLoan() {
		return "<h1> My loan is 5 lakhs </h1>";
	}

	@GetMapping("/contact")
	public String message() {
		return "<h1> THank u for contacting customer support </h1>";
	}

}
