package com.september;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_details")
public class emp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="emp_name")
	private String name;
	@Column(name="emp_City")
	private String city;
	private String phno;
	private String country;
	
	emp()
	{
		
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public emp(String name, String city, String phno, String country) {
		super();
		this.name = name;
		this.city = city;
		this.phno = phno;
		this.country = country;
	}
	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + ", city=" + city + ", phno=" + phno + ", country=" + country + "]";
	}
	
}
