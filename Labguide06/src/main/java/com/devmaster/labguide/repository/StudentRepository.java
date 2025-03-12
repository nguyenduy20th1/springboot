package com.devmaster.labguide.repository;

import com.devmaster.labguide.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
