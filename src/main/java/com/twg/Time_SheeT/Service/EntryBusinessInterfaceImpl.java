package com.twg.Time_SheeT.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twg.Time_SheeT.Entities.Entry;
import com.twg.Time_SheeT.Repository.EntryRepository;

@Service
public class EntryBusinessInterfaceImpl implements EntryBusinessInterface {
	
	@Autowired
	private EntryRepository entryRepository;

	@Override
	public List<Entry> findByEntrydate(Date date) {
		
		return entryRepository.findByDate(date);
	}

	@Override
	public void save(Entry entry) {
        
		entryRepository.save(entry);
	}

	@Override
	public Entry findById(int id) {
		
		return entryRepository.findById(id).get();
	}

}
