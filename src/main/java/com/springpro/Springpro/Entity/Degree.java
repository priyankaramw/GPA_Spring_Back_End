package com.springpro.Springpro.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "t_degree")
@NoArgsConstructor
@AllArgsConstructor
public class Degree {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "university_id")
    private int universityName;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "department")
    private String department;

    @Column(name = "degree_code")
    private String degreeCode;

    @Column(name = "degree_name")
    private String degreeName;

    @Column(name = "semester_count")
    private int semesterCount;

}