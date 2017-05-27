package com.midasit.carte.common.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("userInfo")
public class UserInfo {
	private long userSeq;
	private String userId;
	private String password;
	private String name;
	private String eMail;
	private Date rgstYmdt;

	public long getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(long userSeq) {
		this.userSeq = userSeq;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public Date getRgstYmdt() {
		return rgstYmdt;
	}

	public void setRgstYmdt(Date rgstYmdt) {
		this.rgstYmdt = rgstYmdt;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	private String roleName;
}
