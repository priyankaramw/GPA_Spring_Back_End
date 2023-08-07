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

    @Column(name = "university_id")
    private int universityId;

    @Column(name = "degree_id")
    private int degreeId;

    @Column(name = "registration_no")
    private String registrationNo;

    @Column(name = "semester_count")
    private int semesterCount;

    @Column(name = "year_at_signup")
    private int yearAtSignup;

    @Column(name = "access_level")
    private int accessLevel;

}
