package com.midasit.carte.common.model;

import org.apache.ibatis.type.Alias;

@Alias("carteInfo")
public class CarteInfo {
	private long carteId;
	private String ymd;
	private String type;
	private long menuId;
	private String rgstYmdt;

	public long getCarteId() {
		return carteId;
	}

	public void setCarteId(long carteId) {
		this.carteId = carteId;
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
