package com.example.model;

import java.util.Date;

/**
 * @author Jin.D
 * @date: 2018年3月15日 上午10:03:26
 */
public class User {
	public String id;
	public String username;
	public String password;
	public String phone;
	public String email;
	public String appId;
	public String headIcon;
	public String validateCode;
	public Date sendCodeTime;
	public Double balance;
	public Boolean supplier;
	public Date createDate;

	public void setId(String id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public void setHeadIcon(String headIcon) {
		this.headIcon = headIcon;
	}

	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
	}

	public void setSendCodeTime(Date sendCodeTime) {
		this.sendCodeTime = sendCodeTime;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void setSupplier(Boolean supplier) {
		this.supplier = supplier;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getAppId() {
		return appId;
	}

	public String getHeadIcon() {
		return headIcon;
	}

	public String getValidateCode() {
		return validateCode;
	}

	public Date getSendCodeTime() {
		return sendCodeTime;
	}

	public Double getBalance() {
		return balance;
	}

	public Boolean getSupplier() {
		return supplier;
	}

	public Date getCreateDate() {
		return createDate;
	}

}
