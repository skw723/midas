package com.midasit.carte.user.model;

import org.apache.ibatis.type.Alias;

@Alias("mealHistoryInfo")
public class MealHistoryInfo {
	private long historyId;
	private String userId;
	private String ymd;
	private String type;
	private long menuId;
	private String rgstYmdt;

	public long getHistoryId() {
		return historyId;
	}

	public void setHistoryId(long historyId) {
		this.historyId = historyId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getYmd() {
		return ymd;
	}

	public void setYmd(String ymd) {
		this.ymd = ymd;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getMenuId() {
		return menuId;
	}

	public void setMenuId(long menuId) {
		this.menuId = menuId;
	}

	public String getRgstYmdt() {
		return rgstYmdt;
	}

	public void setRgstYmdt(String rgstYmdt) {
		this.rgstYmdt = rgstYmdt;
	}
}
