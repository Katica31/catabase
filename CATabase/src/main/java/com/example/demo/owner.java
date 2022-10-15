package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class owner {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idOwner;
	
	@Column
	private String OName;
	
	@Column
	private String OPhone;

	public owner() {
	}

	public owner(String oName, String oPhone) {
		super();
		OName = oName;
		OPhone = oPhone;
	}

	public int getIdOwner() {
		return idOwner;
	}

	public void setIdOwner(int idOwner) {
		this.idOwner = idOwner;
	}

	public String getOName() {
		return OName;
	}

	public void setOName(String oName) {
		OName = oName;
	}

	public String getOPhone() {
		return OPhone;
	}

	public void setOPhone(String oPhone) {
		OPhone = oPhone;
	}

	@Override
	public String toString() {
		return "owner [idOwner=" + idOwner + ", OName=" + OName + ", OPhone=" + OPhone + "]";
	}
	
	
	
}
