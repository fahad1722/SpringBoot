package com.security.loginRegister.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.loginRegister.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
