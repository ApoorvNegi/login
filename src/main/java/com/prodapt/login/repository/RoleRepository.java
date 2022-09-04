package com.prodapt.login.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.login.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}