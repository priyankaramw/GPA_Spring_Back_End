package com.springpro.Springpro.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "t_student")
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "name_initials")
    private String nameWithInitials;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "university")
    private String university;

    @Column(name = "degree")
    private String degreeProgram;

    @Column(name = "registration_no")
    private int registrationNo;

    @Column(name = "semesters")
    private int noOfSemesters;

    @Column(name = "year_at_signup")
    private int yearAtSignup;


}
