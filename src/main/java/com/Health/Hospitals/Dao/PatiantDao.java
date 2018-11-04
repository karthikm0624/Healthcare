package com.Health.Hospitals.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Health.Hospitals.Patient;
@Repository
public interface PatiantDao extends JpaRepository<Patient, Long> {
	
	

}
