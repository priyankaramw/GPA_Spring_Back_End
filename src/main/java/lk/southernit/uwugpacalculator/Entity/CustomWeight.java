package lk.southernit.uwugpacalculator.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "t_custom_weight")
@NoArgsConstructor
@AllArgsConstructor
public class CustomWeight {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "student_id", nullable = false)
    private int studentId;

    @Column(name = "grade", nullable = false)
    private String grade;

    @Column(name = "grade_weight", nullable = false)
    private double gradeWeight;

}
