package com.midasit.carte.common.model;

import org.apache.ibatis.type.Alias;

@Alias("carteSearchParam")
public class CarteSearchParam {
	private String startYmd;
	private String endYmd;
	private String currentYear;
	private String currentMonth;

	public String getCurrentYear() {
		return currentYear;
	}

	public void setCurrentYear(String currentYear) {
		this.currentYear = currentYear;
	}

	public String getCurrentMonth() {
		return currentMonth;
	}

	public void setCurrentMonth(String currentMonth) {
		this.currentMonth = currentMonth;
	}

	public String getStartYmd() {
		return startYmd;
	}

	public void setStartYmd(String startYmd) {
		this.startYmd = startYmd;
	}

	public String getEndYmd() {
		return endYmd;
	}

	public void setEndYmd(String endYmd) {
		this.endYmd = endYmd;
	}
}
