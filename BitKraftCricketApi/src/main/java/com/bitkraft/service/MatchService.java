package com.bitkraft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitkraft.model.Matches;
import com.bitkraft.repository.MatchesRepo;

@Service
public class MatchService {

	@Autowired
	private MatchesRepo matchRepo;
	
	public void saveMatch(Matches macthes)
	{
		matchRepo.save(macthes);
	}
	
	
	public List<Matches> getAllMatches(){
		return matchRepo.findAll();
	}
	
}
