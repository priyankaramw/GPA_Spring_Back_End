package lk.southernit.uwugpacalculator.Controller;


import lk.southernit.uwugpacalculator.Entity.Subject;
import lk.southernit.uwugpacalculator.Service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin  //@CrossOrigin("http://localhost:5173/")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    // to insert.
    @PostMapping("/addSubject")
    public Subject addSubject(@RequestBody Subject subject) {
        return subjectService.saveSubject(subject);
    }

    // to insert as a list.
    @PostMapping("/addSubjectList")
    public List<Subject> addSubjectList(@RequestBody List<Subject> subjects) {
        return subjectService.saveSubjectList(subjects);
    }

    // to read all.
    @GetMapping("/getAllSubjects")
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    // to get by id.
    @GetMapping("/getSubjectById/{id}")
    public Subject getSubjectById(@PathVariable int id) {
        return subjectService.getSubjectById(id);
    }

    // for update.
    @PutMapping("/updateSubject")
    public Subject updateSubject(@RequestBody Subject subject) {
        return subjectService.updateSubject(subject);
    }

    // delete
    @DeleteMapping("/deleteSubject/{id}")
    public String deleteSubject(@PathVariable int id) {
        return subjectService.deleteSubject(id);
    }

}
