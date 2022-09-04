package com.prodapt.login.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.login.entity.User;
import com.prodapt.login.entity.UserDetails;
@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetails, Long> {
	User findByEmail(String email);
}