package lk.southernit.uwugpacalculator.Repository;

import lk.southernit.uwugpacalculator.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
