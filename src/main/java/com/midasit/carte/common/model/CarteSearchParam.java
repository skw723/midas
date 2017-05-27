package com.midasit.carte.common.model;

import org.apache.ibatis.type.Alias;

@Alias("carteSearchParam")
public class CarteSearchParam {
	private String startYmd;
	private String endYmd;

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
