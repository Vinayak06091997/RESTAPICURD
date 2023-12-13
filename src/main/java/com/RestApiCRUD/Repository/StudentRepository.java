package com.RestApiCRUD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RestApiCRUD.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
