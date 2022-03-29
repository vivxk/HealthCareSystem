package com.cg.healthcare.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.healthcare.entities.DiagnosticTest;

public interface ITestRepository extends JpaRepository<DiagnosticTest, Integer> {

}
