package com.twg.Time_SheeT.Service;

import java.util.List;

import com.twg.Time_SheeT.Entities.Bookingshistory;

public interface BookingshistoryBusinessInterface {
	
	public void save(Bookingshistory history);
	
	public List<Bookingshistory> findByUserid(int id);
	
	

}
