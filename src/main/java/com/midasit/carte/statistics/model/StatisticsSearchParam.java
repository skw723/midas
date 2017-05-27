package com.midasit.carte.statistics.model;

import org.apache.ibatis.type.Alias;

@Alias("statisticsSearchParam")
public class StatisticsSearchParam {
	private String userId;
	private String startYmd;
	private String endYmd;
	private long menuId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public long getMenuId() {
		return menuId;
	}

	public void setMenuId(long menuId) {
		this.menuId = menuId;
	}
}
