package com.twg.Time_SheeT.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.twg.Time_SheeT.Entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query(value = "select * from user where username=:name limit 1",nativeQuery = true)
	public User findByUsername(String name);

}
