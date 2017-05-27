package com.midasit.carte.common.model;

import org.apache.ibatis.type.Alias;

@Alias("imageInfo")
public class ImageInfo {
	private long imgId;
	private long menuId;
	private String imgName;
	private String imgPath;
	private String rgstYmdt;

	public long getImgId() {
		return imgId;
	}

	public void setImgId(long imgId) {
		this.imgId = imgId;
	}

	public long getMenuId() {
		return menuId;
	}

	public void setMenuId(long menuId) {
		this.menuId = menuId;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getRgstYmdt() {
		return rgstYmdt;
	}

	public void setRgstYmdt(String rgstYmdt) {
		this.rgstYmdt = rgstYmdt;
	}
}
