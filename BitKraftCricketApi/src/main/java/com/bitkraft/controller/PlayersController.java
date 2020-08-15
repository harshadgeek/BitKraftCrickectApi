package com.bitkraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitkraft.model.Players;
import com.bitkraft.service.PlayersService;

@RestController("/players")
public class PlayersController {

	@Autowired
	private PlayersService playersService;
	
	
	@GetMapping
	private List<Players> playerPageable() {
		return playersService.getPlayers();
	}
	
	@PostMapping
	private ResponseEntity<String> addPlayer(@RequestBody Players players){
		
		playersService.savePlayers(players);
		return  ResponseEntity.status(HttpStatus.CREATED).body("new player created");
	}

	
}
