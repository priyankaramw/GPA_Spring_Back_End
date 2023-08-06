package com.springpro.Springpro.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Student_db")
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private int id;

    @Column(name = "first_name")
    private String firstName;
    private String lastName;
    private String nameWithInitial;
    private String email;
    private String mobile;
    private String university;
    private String degreeProgram;
    private int noOfSemesters;
    private int yearAtSignup;

    @Column(name = "ST_MARK")
    private int mark;

    @Column(name = "NAME")
    private String name;

}
