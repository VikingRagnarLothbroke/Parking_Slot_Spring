package com.twg.Time_SheeT.Service;

import com.twg.Time_SheeT.Entities.User;

public interface UserBusinessInterface {
	
	public void save(User user);
	
	public User findByUsername(String name);

}
