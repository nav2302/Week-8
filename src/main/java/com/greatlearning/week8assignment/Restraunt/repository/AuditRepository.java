package com.greatlearning.week8assignment.Restraunt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.week8assignment.Restraunt.model.AuditLog;

@Repository
public interface AuditRepository extends JpaRepository<AuditLog, Integer>{

}
