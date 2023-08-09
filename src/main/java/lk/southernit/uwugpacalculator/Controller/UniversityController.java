package lk.southernit.uwugpacalculator.Controller;

import lk.southernit.uwugpacalculator.Entity.University;
import lk.southernit.uwugpacalculator.Service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin  //@CrossOrigin("http://localhost:5173/")
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    // to insert.
    @PostMapping("/addUniversity")
    public University addUniversity(@RequestBody University university) {
        return universityService.saveUniversity(university);
    }

    // to insert as a list.
    @PostMapping("/addUniversityList")
    public List<University> addUniversityList(@RequestBody List<University> university) {
        return universityService.saveUniversityList(university);
    }

    // to read all.
    @GetMapping("/getAllUniversities")
    public List<University> getAllUniversities() {
        return universityService.getAllUniversities();
    }

    // to get by id.
    @GetMapping("/getUniversityById/{id}")
    public University getUniversityById(@PathVariable int id) {
        return universityService.getUniversityById(id);
    }

    // for update.
    @PutMapping("/updateUniversity")
    public University updateUniversity(@RequestBody University university) {
        return universityService.updateUniversity(university);
    }

    // delete
    @DeleteMapping("/deleteUniversity/{id}")
    public String deleteUniversity(@PathVariable int id) {
        return universityService.deleteUniversity(id);
    }

}
