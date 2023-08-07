package com.springpro.Springpro.Service;

import com.springpro.Springpro.Entity.Student;
import com.springpro.Springpro.Repository.StudentRepo;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    // to insert single record.
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    // to insert list.
    public List<Student> saveStudentList(List<Student> students) {
        return studentRepo.saveAll(students);
    }

    // to read all.
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    // for getting details by id.
    public Student getStudentById(int id) {
        return studentRepo.findById(id).orElse(null);
    }

    // for update.
    public Student updateStudent(Student student) {
        Student tempStudent = studentRepo.findById(student.getId()).orElse(null);
        if (tempStudent != null) {
            tempStudent.setNameFirst(student.getNameFirst());
            tempStudent.setNameLast(student.getNameLast());
            tempStudent.setNameInitials(student.getNameInitials());
            tempStudent.setEmail(student.getEmail());
            tempStudent.setMobile(student.getMobile());
            tempStudent.setUniversityId(student.getUniversityId());
            tempStudent.setDegreeId(student.getDegreeId());
            tempStudent.setRegistrationNo(student.getRegistrationNo());
            tempStudent.setSemesterCount(student.getSemesterCount());
            tempStudent.setYearAtSignup(student.getYearAtSignup());
            tempStudent.setAccessLevel(student.getAccessLevel());

            studentRepo.save(tempStudent);
            return tempStudent;
        }
        return null;
    }

    // delete
    public String deleteStudent(int id) {
        if (studentRepo.existsById(id)) {
            studentRepo.deleteById(id);
            return "Deleted";
        }
        return "Invalid delete request.";
    }
}
