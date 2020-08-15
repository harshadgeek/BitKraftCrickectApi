package com.bitkraft.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Players {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "PlayerName")
	private String playerName;
	@Column(name = "PlayerAge")
	private int age;
	@Column(name = "PlayerType")
	private String type;
	@Column(name = "RunRate",precision = 2,scale = 2)
	private BigDecimal runRate;
}
