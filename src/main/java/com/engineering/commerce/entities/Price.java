package com.engineering.commerce.entities;

import java.time.LocalDate;

public class Price {
	private String Id;
	private String currencyCode;
	private long centAmount;
	private LocalDate validFrom;
	private LocalDate validUntil;

	//GETERS------------------------------

	public String getId(){
		return Id;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public long getCentAmount() {
		return centAmount;
	}

	public LocalDate getValidFrom(){
		return validFrom;
	};

	public LocalDate getValidUntil(){
		return validUntil;
	}

	//SETERS---------------------------------

	public void setId(String Id){
		this.Id = Id;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public void setCentAmount(long centAmount) {
		this.centAmount = centAmount;
	}

	public void setValidFrom(LocalDate validFrom){
		this.validFrom = validFrom;
	}

	public void setValidUntil(LocalDate validUntil){
		this.validUntil = validUntil;
	}



}