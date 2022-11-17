package com.skilldistillery.payroll.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.payroll.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);

}
