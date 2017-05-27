package com.midasit.carte.admin.model;

import org.apache.ibatis.type.Alias;

@Alias("menuSearchParam")
public class MenuSearchParam {
	private String searchType;
	private String searchValue;

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getSearchValue() {
		return searchValue;
	}

	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
}
