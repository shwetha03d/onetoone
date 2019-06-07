package com.xworkz.demo.tester;

import com.xworkz.demo.dto.CountryDTO;

public class CountryTester {
	
	public static void main(String[] args) {
		CountryDTO countryDTO=new CountryDTO();
		countryDTO.setName("India");
		countryDTO.setCountryCode(91);
		countryDTO.setNoOfStates(29);
		countryDTO.setPopulation( (long) 121.000000);
		
		
		System.out.println(countryDTO);
		
		
		
	}
	
	

}
