package com.xworkz.demo.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


//associations
@Entity

@Table(name="pm_table")
public class PrimeMinisterDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name="auto", strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="COUNTRY_ID")
	private int id;
	@Column(name="P_NAME")
	private String name;
	@Column(name="PLACE")
	private String place;
	@Column(name="AGE")
	private int age;
	@Column(name="PARTY_NAME")
	private String partyName;
	
	@OneToOne(cascade=CascadeType.ALL)//map relation on java
	@JoinColumn(name="COUNTRY_ID")
	private CountryDTO country;
	

	public PrimeMinisterDTO() {
		System.out.println("created :\t"+this.getClass().getSimpleName());
	}

	
	public void setCountry(CountryDTO country) {
		this.country = country;
	}
	
	public CountryDTO getCountry() {
		return country;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getPartyName() {
		return partyName;
	}


	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}


	@Override
	public String toString() {
		return "PrimeMinister [name=" + name + ", place=" + place + ", age=" + age + ", partyName=" + partyName + "]";
	}
	
	

}
