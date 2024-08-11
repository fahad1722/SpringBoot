package com.security.JWT.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.security.JWT.entities.User;

@Service
public class UserService {

	private List<User> users = new ArrayList<User>();

	public UserService() {
		users.add(new User(UUID.randomUUID().toString(), "Fahad", "fahad17@gmail.com"));
		users.add(new User(UUID.randomUUID().toString(), "Fahad1", "fahad171@gmail.com"));
		users.add(new User(UUID.randomUUID().toString(), "Fahad2", "fahad17@gmail.com"));
		users.add(new User(UUID.randomUUID().toString(), "Fahad3", "fahad17@gmail.com"));
	}

	public List<User> getUsers() {
		return this.users;
	}
}
