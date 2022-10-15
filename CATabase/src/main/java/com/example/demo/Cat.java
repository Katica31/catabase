package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cat")
public class Cat {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCat;
	private String CName;
	private int CAge;
	private String CColor;
	private String CKind;
	private String Cowner;
	
	
	public Cat(int idCat, String cName, int cAge, String cColor, String cKind, String cowner) {
		super();
		this.idCat = idCat;
		CName = cName;
		CAge = cAge;
		CColor = cColor;
		CKind = cKind;
		Cowner = cowner;
	}
	
	
	public Cat() {
	}


	public int getIdCat() {
		return idCat;
	}


	public void setIdCat(int idCat) {
		this.idCat = idCat;
	}


	public String getCName() {
		return CName;
	}


	public void setCName(String cName) {
		CName = cName;
	}


	public int getCAge() {
		return CAge;
	}


	public void setCAge(int cAge) {
		CAge = cAge;
	}


	public String getCColor() {
		return CColor;
	}


	public void setCColor(String cColor) {
		CColor = cColor;
	}


	public String getCKind() {
		return CKind;
	}


	public void setCKind(String cKind) {
		CKind = cKind;
	}


	public String getCowner() {
		return Cowner;
	}


	public void setCowner(String cowner) {
		Cowner = cowner;
	}


	@Override
	public String toString() {
		return "cat [idCat=" + idCat + ", CName=" + CName + ", CAge=" + CAge + ", CColor=" + CColor + ", CKind=" + CKind
				+ ", Cowner=" + Cowner + "]";
	}
	
	
	
	
}
