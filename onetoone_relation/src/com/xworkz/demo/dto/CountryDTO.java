package com.xworkz.demo.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

//own's the relation
//number's
//directions uni and bi
@Entity
@Table(name="country_table")
public class CountryDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name="auto", strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="COUNTRY_ID")
	private int id;
	@Column(name="C_NAME")
	private String name;
	@Column(name="C_CODE")
	private int countryCode;
	@Column(name="POPULATION")
	private long  population;
	@Column(name="NO_OF_STATES")
	private int noOfStates;
	
	@OneToOne(cascade=CascadeType.ALL)//map relation on java
	@PrimaryKeyJoinColumn// map primary key on db forign key
	private PrimeMinisterDTO primeMinister;
	
	
	public CountryDTO() {
		System.out.println("created :\t"+this.getClass().getSimpleName());
	}
	
	public void setPrimeMinister(PrimeMinisterDTO primeMinister) {
		this.primeMinister = primeMinister;
	}
	
	public PrimeMinisterDTO getPrimeMinister() {
		return primeMinister;
	}

	public long getPopulation() {
		return population;
	}
	
	public void setPopulation(long population) {
		this.population = population;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCountryCode() {
		return countryCode;
	}


	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}


	public int getNoOfStates() {
		return noOfStates;
	}


	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}


	@Override
	public String toString() {
		return "CountryDTO [population=" + population + ", name=" + name + ", countryCode=" + countryCode + ", noOfStates=" + noOfStates
				+ "]";
	}
	
	

}
