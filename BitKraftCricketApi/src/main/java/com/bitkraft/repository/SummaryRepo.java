package com.bitkraft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitkraft.model.Summary;

public interface SummaryRepo extends JpaRepository<Summary, Integer> {

}
