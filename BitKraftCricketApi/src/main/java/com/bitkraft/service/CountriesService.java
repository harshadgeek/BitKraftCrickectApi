package com.bitkraft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitkraft.model.Countries;
import com.bitkraft.repository.CountryRepo;

@Service
public class CountriesService {

	@Autowired
	private CountryRepo countryRepo;
	
	public void saveCountry(Countries countries)
	{
		countryRepo.save(countries);
	}
	
	
	public List<Countries> getCountries(){
		return countryRepo.findAll();
	}
}
