package lk.southernit.uwugpacalculator.Repository;

import lk.southernit.uwugpacalculator.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Integer> {
    Optional<Student> findByEmail(String email);
}
