package lk.southernit.uwugpacalculator.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

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
    private int universityId;

    @Column(name = "added_by_id")
    private int addedById;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "department")
    private String department;

    @Column(name = "degree_code")
    private String degreeCode;

    @Column(name = "degree_name", nullable = false)
    private String degreeName;

    @Column(name = "semester_count")
    private int semesterCount;

    @OneToMany(mappedBy = "degree")
    private Set<Student> students;

}