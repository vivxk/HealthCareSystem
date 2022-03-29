package com.cg.healthcare.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.healthcare.entities.Patient;
import com.cg.healthcare.entities.User;

public interface IPatientRepository extends JpaRepository<Patient, Integer> {

	List<Patient> findAllByname(String name);
	
	Patient findByUser(User user);
}
