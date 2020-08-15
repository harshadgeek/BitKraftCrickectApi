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

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Venue {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "VenueId")
	private int venueId;
	
	
	private String nameOfVenue;
	@OneToOne
	@JoinColumn(name = "match_id", referencedColumnName = "MatchId")
	private Matches matches;
	
}
