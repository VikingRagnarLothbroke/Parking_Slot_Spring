package com.twg.Time_SheeT.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twg.Time_SheeT.Entities.Bookingshistory;

public interface BookingshistoryRepository extends JpaRepository<Bookingshistory, Integer> {
	
	public List<Bookingshistory> findByUserid(int id);

}
