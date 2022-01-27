package com.boats.price.nci.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boats.price.nci.entities.User;









public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
