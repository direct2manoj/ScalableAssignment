package com.sa.studentaap.repository;

import com.sa.studentaap.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Annotation
@Repository

// Interface
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
