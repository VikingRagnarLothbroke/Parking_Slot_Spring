package com.twg.Time_SheeT.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twg.Time_SheeT.Entities.Entry;

public interface EntryRepository extends JpaRepository<Entry, Integer> {
	
	public List<Entry> findByDate(Date date);
}
