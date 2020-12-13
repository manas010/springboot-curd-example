package com.manas.curd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Manas Dash
 *
 */
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name="USERS_TBL")
public class Users {
	
	@Id
    @GeneratedValue
    @Column(name="USER_ID")
	private int id;
	private String name;
	private String address;
	private String userType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	/*
	 * public Users(int id, String name, String address, String userType) { super();
	 * this.id = id; this.name = name; this.address = address; this.userType =
	 * userType; }
	 */

	
}
