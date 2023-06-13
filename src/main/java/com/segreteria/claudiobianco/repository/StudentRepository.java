package com.segreteria.claudiobianco.repository;

import com.segreteria.claudiobianco.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
