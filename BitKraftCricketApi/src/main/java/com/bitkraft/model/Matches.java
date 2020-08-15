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
public class Matches {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MatchId")
	private int id;
	@Column(name = "MatchName")
	private String matchName;

	@OneToOne
	@JoinColumn(name = "summary_id",referencedColumnName = "SummaryId")
	private Summary summary;
	
	@OneToOne
	@JoinColumn(name = "venue_id",referencedColumnName = "VenueId")
	private Venue venue;
	
}
