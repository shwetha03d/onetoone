package com.xworkz.demo.tester;

import com.xworkz.demo.dao.CountryDAO;
import com.xworkz.demo.dto.CountryDTO;
import com.xworkz.demo.dto.PrimeMinisterDTO;

public class Tester {
	public static void main(String[] args) {
		CountryDTO countryDTO=new CountryDTO();
		countryDTO.setName("AUSTRALIA");
		countryDTO.setCountryCode(61);
		countryDTO.setNoOfStates(6);
		countryDTO.setPopulation(3l);
		

		PrimeMinisterDTO pmdto=new PrimeMinisterDTO();
		pmdto.setAge(45);
		pmdto.setName("Scott Morrison");
		pmdto.setPartyName("Liberal");
		pmdto.setPlace("Australia");
		
		
		countryDTO.setPrimeMinister(pmdto);
		
		pmdto.setCountry(countryDTO);
		
		CountryDAO cdao=new CountryDAO();
		cdao.save(countryDTO);
		
		
	}

}
