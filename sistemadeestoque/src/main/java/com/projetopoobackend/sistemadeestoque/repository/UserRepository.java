package com.projetopoobackend.sistemadeestoque.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.projetopoobackend.sistemadeestoque.domain.User;



	
	@Repository
	public interface UserRepository extends MongoRepository<User, String> {

	    public User findByEmail(String email);
	}
	

	
	
 


