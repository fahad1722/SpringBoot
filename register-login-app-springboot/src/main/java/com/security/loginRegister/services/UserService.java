package com.security.loginRegister.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.security.loginRegister.controllers.dto.UserRegistrationDto;
import com.security.loginRegister.entities.User;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);

}
