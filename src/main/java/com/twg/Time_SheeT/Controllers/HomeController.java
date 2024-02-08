package com.twg.Time_SheeT.Controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.twg.Time_SheeT.Entities.Activebookings;
import com.twg.Time_SheeT.Entities.Bookingshistory;
import com.twg.Time_SheeT.Entities.Entry;
import com.twg.Time_SheeT.Entities.User;
import com.twg.Time_SheeT.Service.ActivebookingsBusinessInterface;
import com.twg.Time_SheeT.Service.BookingshistoryBusinessInterface;
import com.twg.Time_SheeT.Service.EntryBusinessInterface;
import com.twg.Time_SheeT.Service.UserBusinessInterface;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@Autowired
	private UserBusinessInterface userBusinessInterface;
	
	@Autowired
	private EntryBusinessInterface  entryBusinessInterface;
	
	@Autowired
	private ActivebookingsBusinessInterface activebookingsBusinessInterface;
	
	@Autowired
	private BookingshistoryBusinessInterface bookingshistoryBusinessInterface;
	
	@Autowired
	HttpSession session;
	
	@GetMapping("/test")
	public String testmethod() {
		return "demo";
	}
//Register
	@GetMapping("/register")
	public String register() {
		return "Register";
	}
//user register
	@PostMapping("/registerpage")
	public String userregister(@ModelAttribute("user") User user) {
		
		userBusinessInterface.save(user);
		
		return "login";
	}

//Login
	@PostMapping("/userlogin")
	public String userloginmethod(@ModelAttribute("user") User user) {
		
		User user1=userBusinessInterface.findByUsername(user.getUsername());
		
		
		
		if(user1.getPassword().equals(user.getPassword())) {
			
			session.setAttribute("user", user1);
			
			return "home";
				
		}
		else {
			return "login";
		}
	}
//Select Date
	@GetMapping("/dateselect")
	public String selectdatemethod() {                    
		
		return "dateselection";
		
	}
//Slot Checking
	@PostMapping("/slotcheck")
	public String slotcheckmethod(@ModelAttribute("entry") Entry entry , Model model) {
		
		List<Entry> entries= entryBusinessInterface.findByEntrydate(entry.getDate());
		
		model.addAttribute("entries", entries);
		
		
		return "mainhomepage";
	
	}	
//Slot Booking
	@GetMapping("/slotbook")
	public String slotbookmethod(@ModelAttribute("entry") Entry entry,@ModelAttribute("activebookings") Activebookings active,
			@ModelAttribute("bookingshistory") Bookingshistory history,@RequestParam("mahesh") int id) {
		
		User user1=(User)session.getAttribute("user");
		
	Entry entry1=entryBusinessInterface.findById(id);
		
		entry1.setId(id);
		entry1.setStatus(1);
		
		//entry.setId(id);
		
		entryBusinessInterface.save(entry1);
		
		activebookingsBusinessInterface.save(active);
		
		bookingshistoryBusinessInterface.save(history);
		
		
		return "home";
	}
//Previous Bookings
	@PostMapping("/gethistory")
	public String gethistorymethod(@RequestParam("id") int id,Model model) {
		
		List<Bookingshistory> entries=bookingshistoryBusinessInterface.findByUserid(id);
		
		model.addAttribute("entries",entries);
		
		return "previousbookingspage";
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
