package com.twg.Time_SheeT.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twg.Time_SheeT.Entities.User;
import com.twg.Time_SheeT.Repository.UserRepository;

@Service
public class UserBusinessInterfaceImpl implements UserBusinessInterface {
    
	@Autowired
	private UserRepository userRepository;

	@Override
	public void save(User user) {
     userRepository.save(user);
	}

	@Override
	public User findByUsername(String name) {
		
		return userRepository.findByUsername(name);
	}
	
	
}
