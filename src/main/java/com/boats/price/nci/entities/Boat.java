package com.boats.price.nci.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "boattab")
public class Boat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "btype")
	private float bType=0;
	@Column(name = "yearbuilt")
	private float yearBuilt=2021.0f;
	private float length=0;
	private float width=0;
	@Column(name = "ftype")
	private float fType=0;
	private double price_prediction=0;
	
	public int getId() {
		return id;
	}
	public float getbType() {
		return bType;
	}
	public void setbType(float bType) {
		this.bType = bType;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getYearBuilt() {
		return yearBuilt;
	}
	public void setYearBuilt(float yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}

	public float getfType() {
		return fType;
	}
	public void setfType(float fType) {
		this.fType = fType;
	}
	public double getPrice_prediction() {
		return price_prediction;
	}
	public void setPrice_prediction(double price_prediction) {
		this.price_prediction = price_prediction;
	}
	@Override
	public String toString() {
		return "Boat [id=" + id + ", type=" + bType + ", year built=" + yearBuilt + ", length=" + length + ", width="
				+ width + ", fuel type=" + fType + "]";
	}
	
}
