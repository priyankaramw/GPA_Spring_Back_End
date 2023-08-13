package lk.southernit.uwugpacalculator.Entity;

import jakarta.persistence.*;
import lk.southernit.uwugpacalculator.Resources.Const;
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

    @Column(name = "student_id", nullable = false)
    private int studentId;

    @Column(name = "semester_id", nullable = false)
    private int semesterId;

    @Column(name = "subject_id") // Keep empty if changed manually.
    private int subjectId;

    @Column(name = "subject_code")
    private String subjectCode;

    @Column(name = "subject_name")
    private String subjectName;

    @Column(name = "grade", nullable = false)
    private String grade;

    @Column(name = "credits", nullable = false)
    private String credits;

    @Column(name = "should_exclude")
    private boolean shouldExclude;


//    double x = Const.A_PLUS;

}
