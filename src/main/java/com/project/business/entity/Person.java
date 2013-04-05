package com.project.business.entity;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4787048663076435865L;

	private String dni;
	
	private String firstname;
	
	private String surname;
	
	private Character gender;
	
	private String email;
	
	private String city;
	
	private Date birthDate;
	
	

	public Person() {
		super();		
	}

	public Person(String dni, String firstname, String surname, Character gender,
			String email, String city, Date birthDate) {		
		this.dni = dni;
		this.firstname = firstname;
		this.surname = surname;
		this.gender = gender;
		this.email = email;
		this.city = city;
		this.birthDate = birthDate;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
