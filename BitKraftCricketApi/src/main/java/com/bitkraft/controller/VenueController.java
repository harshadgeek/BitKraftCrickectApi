package com.bitkraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitkraft.model.Venue;
import com.bitkraft.service.VenueService;

@RestController("/venues")
public class VenueController {
	
	@Autowired
	private VenueService venueService;
	
	@GetMapping
	private List<Venue> venuesPageable() {
		return venueService.getVenues();
	}
	
	@PostMapping
	private ResponseEntity<String> addVenues(@RequestBody Venue venue){
		venueService.saveVenue(venue);
		return  ResponseEntity.status(HttpStatus.CREATED).body("new venue created");
	}

}
