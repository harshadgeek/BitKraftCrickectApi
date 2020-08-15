package com.bitkraft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitkraft.model.Venue;

public interface VenueRepo extends JpaRepository<Venue, Integer>{

}
