package com.engineering.commerce.entities;

import java.time.LocalDate;

public class Price {
	private String currencyCode;
	private long centAmount;
//	private LocalDate validFrom;
//	private LocalDate validUntil;

	public String getCurrencyCode() {
		return currencyCode;
	}

	public long getCentAmount() {
		return centAmount;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public void setCentAmount(long centAmount) {
		this.centAmount = centAmount;
	}

}