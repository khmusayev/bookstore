package de.khayal.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import de.khayal.bookstore.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{

	User findByUsername(String username);
	
}
