package com.ebuzz.technicalassessment.repository;

import com.ebuzz.technicalassessment.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {
    public Grade findByGradeCode(String gradeCode);
}
