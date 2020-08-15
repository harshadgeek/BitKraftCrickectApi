package com.bitkraft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Summary {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SummaryId")
	private int id;
	private String winner;
	private String looser;
	private String manOfMatch;
	private String bowlerOfMatch;
	private String bestFielder;
	
	@OneToOne
	@JoinColumn(name = "team_id", referencedColumnName = "TeamId")
	private Teams teams;
	
	@OneToOne
	@JoinColumn(name = "match_id", referencedColumnName = "MatchId")
	private Matches matches;

}
