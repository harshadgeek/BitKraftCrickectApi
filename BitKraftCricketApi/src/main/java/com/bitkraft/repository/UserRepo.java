package com.bitkraft.repository;

import org.springframework.data.repository.CrudRepository;

import com.bitkraft.model.User;



public interface UserRepo extends CrudRepository<User, Long> {

	public User findByUsername(String username);

	
}
