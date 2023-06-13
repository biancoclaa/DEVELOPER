package com.segreteria.claudiobianco.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name = "students")
@SequenceGenerator(name = "STUDENTS_SEQUENCE", sequenceName = "STUDENTS_SEQUENCE_ID", allocationSize = 1)
@JsonInclude(JsonInclude.Include.NON_EMPTY)

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "STUDENTS_SEQUENCE")
    @Getter
    @Setter
    private Integer id;
    @Getter
    @Setter
    private String nome;
    @Getter
    @Setter
    private String cognome;
    @Getter
    @Setter
    private String dataNascita;
    @Getter
    @Setter
    private String codiceFiscale;
    @Getter
    @Setter
    private String numeroMatricola;
}
