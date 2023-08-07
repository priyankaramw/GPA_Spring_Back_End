package com.springpro.Springpro.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "t_subject")
@NoArgsConstructor
@AllArgsConstructor
public class Subject {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "university_id")
    private int universityId;

    @Column(name = "degree_id")
    private int degreeId;

    @Column(name = "semester_id")
    private int semesterId;

    @Column(name = "subject_code")
    private String subjectCode;

    @Column(name = "subject_Name")
    private String subjectName;

    @Column(name = "default_credits")
    private int defaultCredits;

}
