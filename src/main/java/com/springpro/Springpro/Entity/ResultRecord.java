package com.springpro.Springpro.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "t_result_record")
@NoArgsConstructor
@AllArgsConstructor
public class ResultRecord {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "student_id")
    private int studentId;

    @Column(name = "semester_id")
    private int semesterId;

    @Column(name = "subject_code")
    private String subjectCode;

    @Column(name = "subject_name")
    private String subjectName;

    @Column(name = "grade")
    private String grade;

    @Column(name = "credits")
    private String credits;

    @Column(name = "should_exclude")
    private boolean shouldExclude;

}
