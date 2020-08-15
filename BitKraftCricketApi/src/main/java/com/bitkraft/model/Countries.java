package com.bitkraft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "country")
public class Countries {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CountryId")
	private int Id;
	@Column(name = "CountryName")
	private String countryName;
	
	@OneToOne(mappedBy = "countries")
	private Teams teams;
	
	

}
