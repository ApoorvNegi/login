package com.prodapt.login.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.login.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	User findByUserName(String userName);
}