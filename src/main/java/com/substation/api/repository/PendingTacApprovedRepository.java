package com.substation.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.history.RevisionRepository;

import com.substation.api.model.SubstationDefaultReport;

public interface PendingTacApprovedRepository extends CrudRepository<SubstationDefaultReport, Long>, 
JpaRepository<SubstationDefaultReport, Long>, JpaSpecificationExecutor<SubstationDefaultReport>{
	
	
}
