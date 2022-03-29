package com.cg.healthcare.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@Entity
@Table(name="diagnostic_center")
@JsonSerialize
public class DiagnosticCenter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "diagCenter_seq")
	@SequenceGenerator(name="diagCenter_seq", sequenceName = "diagCenter_seq", initialValue = 1, allocationSize = 1 )

	private int diagnosticCenterid;
	private String name;
	private String contactNo;
	private String address;
	private String contactEmail;
	
	@JsonProperty(access = Access.READ_ONLY)
	@OneToMany(mappedBy = "diagnosticCenter",cascade = CascadeType.ALL) 
	private Set<DiagnosticTest> tests =new HashSet<>();
	

	public DiagnosticCenter()
	{		
		
	}	
	
	public DiagnosticCenter(String name, String contactNo, String address, String contactEmail,
			Set<DiagnosticTest> tests) {
		super();
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
		this.contactEmail = contactEmail;
		this.tests = tests;
	}
	public int getDiagnosticCenterid() {
		return diagnosticCenterid;
	}
	public void setDiagnosticCenterid(int diagnosticCenterid) {
		this.diagnosticCenterid = diagnosticCenterid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public Set<DiagnosticTest> getTests() {
		return tests;
	}
	public void setTests(Set<DiagnosticTest> tests) {
		this.tests = tests;
	}

	
	
	
	
	
	
	
	
	
	
	

}




