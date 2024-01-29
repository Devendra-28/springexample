package com.jpa.text.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.text.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	public List<User> findByName(String Name);
	
	@Query(value="select * from User", nativeQuery=true)
    public List<User>getAllUser();
	
	/*
	 * @Query(select u FROM User u WHERE u=:n) public List<User>
	 * getUserByName(@Param("n") String Name);
	 */
}