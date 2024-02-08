package com.twg.Time_SheeT.Service;

import java.util.Date;
import java.util.List;

import com.twg.Time_SheeT.Entities.Entry;

public interface EntryBusinessInterface {
	
	public List<Entry> findByEntrydate(Date date);
	
	public void save(Entry entry);
	
	public Entry findById(int id);

}
