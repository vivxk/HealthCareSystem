package com.cg.healthcare.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name = "patient")
@JsonSerialize
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_seq")
	@SequenceGenerator(name = "patient_seq", sequenceName = "patient_seq", initialValue = 101, allocationSize = 1)
	private int patientId;
	private String name;
	private String phoneNo;
	private int age;
	private String gender;	

	@JsonProperty(access = Access.READ_ONLY)
	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
	private Set<Appointment> appointments = new HashSet<>();

	@JsonIgnore
	@OneToOne
	private User user;

	public int getPatientId() {
		return patientId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public Patient() {

	}

	public Patient(String name, String phoneNo, int age, String gender, Set<Appointment> appointments) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.age = age;
		this.gender = gender;
		this.appointments = appointments;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Set<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(Set<Appointment> appointments) {
		this.appointments = appointments;
	}

}
