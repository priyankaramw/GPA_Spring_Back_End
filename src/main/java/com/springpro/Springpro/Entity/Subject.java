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
    private String universityId;

    @Column(name = "degree_id")
    private String degreeId;

    @Column(name = "semester_id")
    private String semesterId;

    @Column(name = "subject_code")
    private String subjectCode;

    @Column(name = "subject_Name")
    private String subjectName;

    @Column(name = "default_credits")
    private String defaultCredits;

}
