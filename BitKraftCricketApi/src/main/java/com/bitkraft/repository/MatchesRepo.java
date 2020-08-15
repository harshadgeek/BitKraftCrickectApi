package com.bitkraft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitkraft.model.Matches;

public interface MatchesRepo  extends JpaRepository<Matches, Integer>{

}
