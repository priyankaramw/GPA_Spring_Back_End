package com.springpro.Springpro.Controller;

import com.springpro.Springpro.Entity.Student;
import com.springpro.Springpro.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin  //@CrossOrigin("http://localhost:5173/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // to insert.
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    // to insert as a list.
    @PostMapping("/addStudentList")
    public List<Student> addStudentList(@RequestBody List<Student> students) {
        return studentService.saveStudentList(students);
    }

    // to read all.
    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // to get by id.
    @GetMapping("/getStudentById/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    // for update.
    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    // delete
    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id) {
        return studentService.deleteStudent(id);
    }

}
