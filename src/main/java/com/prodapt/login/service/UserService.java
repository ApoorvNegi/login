package com.prodapt.login.service;

import com.prodapt.login.entity.User;
import com.prodapt.login.exception.InvalidCredentialsException;

public interface UserService {
	//Create
		public User addUser(User user);
		//Retrieve
		public User getUserByName(String userName);
		
		//Update
		public User updateUser(User user);
		
		//Delete
		public void deleteUserById(Long id);
		
		//Login
		public User loginUser(User user) throws InvalidCredentialsException;
}