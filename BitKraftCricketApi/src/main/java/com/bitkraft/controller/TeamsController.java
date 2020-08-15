package com.bitkraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitkraft.model.Teams;
import com.bitkraft.service.TeamsService;

@RestController("/teams")
public class TeamsController {

	@Autowired
	private TeamsService teamsService;
	
	@GetMapping
	private List<Teams> teamPageable() {
		return teamsService.getTeams();
	}
	
	@PostMapping
	private ResponseEntity<String> addTeam(@RequestBody Teams teams){
		
		teamsService.saveTeam(teams);
		return  ResponseEntity.status(HttpStatus.CREATED).body("new teams created");
	}

	
}
