package com.segreteria.claudiobianco.service;

import com.segreteria.claudiobianco.openapidemo.api.model.Student;
import com.segreteria.claudiobianco.openapidemo.api.model.Students;
import com.segreteria.claudiobianco.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Students retrieveAllStudents() {
        List<com.segreteria.claudiobianco.model.Student> retrievedStudents = new ArrayList<com.segreteria.claudiobianco.model.Student>() {{
            studentRepository.findAll().forEach(this::add);
        }};

        if (retrievedStudents.isEmpty())
            return null;

        Students students = new Students();

        for (com.segreteria.claudiobianco.model.Student student: retrievedStudents) {
            com.segreteria.claudiobianco.openapidemo.api.model.Student outputStudent = new com.segreteria.claudiobianco.openapidemo.api.model.Student();
            outputStudent.setNome(student.getNome());
            outputStudent.setCognome(student.getCognome());
            outputStudent.setDataNascita(student.getDataNascita());
            outputStudent.setCodiceFiscale(student.getCodiceFiscale());
            outputStudent.setNumeroMatricola(student.getNumeroMatricola());

            students.add(outputStudent);
        }

        return students;
    }

}
