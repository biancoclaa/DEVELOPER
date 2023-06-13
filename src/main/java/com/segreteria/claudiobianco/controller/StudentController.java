package com.segreteria.claudiobianco.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.segreteria.claudiobianco.openapidemo.api.StudentsApi;
import com.segreteria.claudiobianco.openapidemo.api.model.Students;
import com.segreteria.claudiobianco.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@RestController
@RequestMapping (value = "/api/v1/students/")
public class StudentController implements StudentsApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private StudentService studentService;

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    @Override
    public ResponseEntity<Students> getStudents() {
        LOGGER.info("Calling getStudents Api");

        Students students = studentService.retrieveAllStudents();

        if (students == null || students.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).build();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> keepAlive() {
        return null;
    }
}
