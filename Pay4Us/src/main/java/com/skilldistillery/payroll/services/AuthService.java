package com.skilldistillery.payroll.services;

import com.skilldistillery.payroll.entities.User;

public interface AuthService {

	public User register(User user);

	public User getUserByUsername(String username);

	public User getUserById(int userId);

}
