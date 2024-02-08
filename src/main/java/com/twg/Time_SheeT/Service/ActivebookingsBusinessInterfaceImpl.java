package com.twg.Time_SheeT.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twg.Time_SheeT.Entities.Activebookings;
import com.twg.Time_SheeT.Repository.ActivebookingsRepository;

@Service
public class ActivebookingsBusinessInterfaceImpl implements ActivebookingsBusinessInterface {
	
	
	@Autowired
	private ActivebookingsRepository activebookingsRepository;

	@Override
	public void save(Activebookings active) {
		
		activebookingsRepository.save(active);
        		
	}

}
