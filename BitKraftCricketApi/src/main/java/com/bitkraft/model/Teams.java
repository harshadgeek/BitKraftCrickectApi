package com.bitkraft.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "team")
public class Teams {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TeamId")
	private int Id;
	@Column(name = "TeamName")
	private String teamName;
	@Column(name="NoOfPlayers")
	private int noOfPlayers;
	@OneToOne
	@JoinColumn(name = "country_id", referencedColumnName = "CountryId")
	private Countries countries;
	
	@OneToMany
	@OrderBy("playerName asc")
	private List<Players> players;
	
	@OneToOne
	@JoinColumn(name = "summary_id",referencedColumnName = "SummaryId")
	private Summary summary;
	

}
