package com.bitkraft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitkraft.model.Venue;
import com.bitkraft.repository.VenueRepo;

@Service
public class VenueService {
	@Autowired
	private VenueRepo venueRepo;
	
	public void saveVenue(Venue venue)
	{
		venueRepo.save(venue);
	}
	
	public List<Venue> getVenues(){
		return venueRepo.findAll();
	}
	
}
