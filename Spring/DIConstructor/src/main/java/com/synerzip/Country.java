package com.synerzip;

import com.synerzip.pojo.Capital;

public class Country {
	private String countryName;
	private Capital capital;
	public Country(String countryName, Capital capital) {
		super();
		this.countryName = countryName;
		this.capital = capital;
	}
	public String getCountryName() {
		return countryName;
	}
	public Capital getCapital() {
		return capital;
	}
	
	

}
