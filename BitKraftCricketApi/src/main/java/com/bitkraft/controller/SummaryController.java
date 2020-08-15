package com.bitkraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitkraft.model.Summary;
import com.bitkraft.service.SummaryService;

@RestController("/summary")
public class SummaryController {
	
	@Autowired
	private SummaryService summaryService;
	
	@GetMapping
	private List<Summary> summaryPageable() {
		return summaryService.getSummary();
	}
	
	@PostMapping
	private ResponseEntity<String> addSummary(@RequestBody Summary summary){
		
		summaryService.saveSummary(summary);
		return  ResponseEntity.status(HttpStatus.CREATED).body("new summary created");
	}

}
