package com.jpa.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

//		User user =  new User();
//		user.setName("Fahad");
//		user.setCity("hyd");
//		user.setStatus("Im a coder");
//		User user1 = userRepository.save(user);

//		User user1 = new User();
//		user1.setName("F1");
//		user1.setCity("P1");
//		user1.setStatus("Im a P1");
//
//		User user2 = new User();
//		user2.setName("F1");
//		user2.setCity("P1");
//		user2.setStatus("Im a P2");
//
//		List<User> users = List.of(user1, user2);
//		Iterable<User> result = userRepository.saveAll(users);
//		result.forEach(user -> {
//			System.out.println(user);
//		});

//		// update
//		Optional<User> optional = userRepository.findById(2);
//		User user = optional.get();
//		user.setName("ABD");
//		User result = userRepository.save(user);
//		System.out.println(user);
//
//		// get
//		Iterable<User> itr = userRepository.findAll();
//		for (User u : itr) {
//			System.out.println(u);
//		}

		// delete
		// userRepository.deleteById(1);

		// custom finder methods
//		List<User> users = userRepository.findByName("F1");
//		for (User u : users) {
//			System.out.println(u);
//		}
//		List<User> userss = userRepository.findByNameAndCity("F1", "P1");
//		for (User u : userss) {
//			System.out.println(u);
//		}

//		List<User> users = userRepository.getAllUser();
//		for (User u : users) {
//			System.out.println(u);
//		}

//		List<User> users = userRepository.getUserByName("fahad");
//		for (User u : users) {
//			System.out.println(u);
//		}
		List<User> users = userRepository.getUsers();
		for (User u : users) {
			System.out.println(u);
		}
	}

}
