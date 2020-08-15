package com.bitkraft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitkraft.model.Teams;
import com.bitkraft.repository.TeamsRepo;

@Service
public class TeamsService {
	
	@Autowired
	private TeamsRepo teamsRepo;
	
	public void saveTeam(Teams teams)
	{
		teamsRepo.save(teams);
	}
	
	public List<Teams> getTeams(){
		return teamsRepo.findAll();
	}

}
