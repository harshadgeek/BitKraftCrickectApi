package com.bitkraft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitkraft.model.Countries;

public interface CountryRepo extends JpaRepository<Countries, Integer> {

}
