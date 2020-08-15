package com.bitkraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitkraft.model.Matches;
import com.bitkraft.service.MatchService;

@RestController("/matches")
public class MatchController {
	
	@Autowired
	private MatchService matchService;
	
	
	@GetMapping
	private List<Matches> macthesPageable() {
		return matchService.getAllMatches();
	}
	
	@PostMapping
	private ResponseEntity<String> addMatches(@RequestBody Matches matches){
		
		matchService.saveMatch(matches);
		return  ResponseEntity.status(HttpStatus.CREATED).body("new country created");
	}

}
