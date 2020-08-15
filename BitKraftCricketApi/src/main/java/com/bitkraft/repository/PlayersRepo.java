package com.bitkraft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitkraft.model.Players;

public interface PlayersRepo extends JpaRepository<Players, Integer>{

}
