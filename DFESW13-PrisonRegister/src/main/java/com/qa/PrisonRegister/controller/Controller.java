package com.qa.PrisonRegister.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.qa.PrisonRegister.model.PrisonRegister;

@RestController
public class Controller {
	
	private ArrayList<PrisonRegister> registerList = new ArrayList<>();
	
	@PostMapping("/createRegister")
	public ResponseEntity<String> createRegister(@RequestBody PrisonRegister register) {
		System.out.println(register);
		
		//registerlist.size = length of the array
		register.setId(registerList.size() + 1);
		registerList.add(register);
		
		ResponseEntity<String> response = new ResponseEntity<String> ("Prisoner added with ID: " + register.getId(), HttpStatus.CREATED) ;
		return response;
		
		}
	
	@PostMapping("/createSetRegister")
	public boolean createSetBooking () {
		System.out.println("Prisoner recorded");
		registerList.add(new PrisonRegister("Albert McGee", "GBH", "excommunicated from gang, in danger of being attacked", 60, 8, "D", false, false, false ));
		return true;
	}

	
	}
	
	
	

	
