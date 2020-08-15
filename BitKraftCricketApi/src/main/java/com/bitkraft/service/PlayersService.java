package com.bitkraft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitkraft.model.Players;
import com.bitkraft.repository.PlayersRepo;

@Service
public class PlayersService {
	
	@Autowired
	private PlayersRepo playersRepo;
	
	public void savePlayers(Players players)
	{
		playersRepo.save(players);
	}
	
	
	public List<Players> getPlayers(){
		return playersRepo.findAll();
	}

}
