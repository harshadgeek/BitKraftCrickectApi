package com.bitkraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitkraft.model.Countries;
import com.bitkraft.service.CountriesService;

@RestController("/countries")
public class ContriesController {
	
@Autowired
private CountriesService countryService;
	
	@GetMapping
	private List<Countries> countriesPageable() {
		return countryService.getCountries();
	}
	
	@PostMapping
	private ResponseEntity<String> addCountry(@RequestBody Countries countries){
		countryService.saveCountry(countries);
		return  ResponseEntity.status(HttpStatus.CREATED).body("new country created");
	}

}
