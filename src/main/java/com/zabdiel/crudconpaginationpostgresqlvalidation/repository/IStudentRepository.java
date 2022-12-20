package com.zabdiel.crudconpaginationpostgresqlvalidation.repository;
import com.zabdiel.crudconpaginationpostgresqlvalidation.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long>{


}
