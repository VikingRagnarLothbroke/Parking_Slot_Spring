package com.twg.Time_SheeT.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twg.Time_SheeT.Entities.Bookingshistory;
import com.twg.Time_SheeT.Repository.BookingshistoryRepository;

@Service
public class BookingshistoryBusinessInterfaceImpl implements BookingshistoryBusinessInterface {
	
	@Autowired
	private BookingshistoryRepository bookingshistoryRepository;

	@Override
	public void save(Bookingshistory history) {
    
		bookingshistoryRepository.save(history);
			
	}

	@Override
	public List<Bookingshistory> findByUserid(int id) {
		
		return bookingshistoryRepository.findByUserid(id);
	}

}
