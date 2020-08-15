package com.bitkraft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitkraft.model.Summary;
import com.bitkraft.repository.SummaryRepo;

@Service
public class SummaryService {

	@Autowired
	private SummaryRepo summaryRepo;
	
	public void saveSummary(Summary summary)
	{
		summaryRepo.save(summary);
	}
	
	public List<Summary> getSummary(){
		return summaryRepo.findAll();
	}
	
}
