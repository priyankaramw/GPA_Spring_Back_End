package lk.southernit.uwugpacalculator.Controller;

import lk.southernit.uwugpacalculator.Entity.Degree;
import lk.southernit.uwugpacalculator.Service.DegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin  //@CrossOrigin("http://localhost:5173/")
public class DegreeController {

    @Autowired
    private DegreeService degreeService;

    // to insert.
    @PostMapping("/addDegree")
    public Degree addDegree(@RequestBody Degree degree) {
        return degreeService.saveDegree(degree);
    }

    // to insert as a list.
    @PostMapping("/addDegreeList")
    public List<Degree> addDegreeList(@RequestBody List<Degree> degree) {
        return degreeService.saveDegreeList(degree);
    }

    // to read all.
    @GetMapping("/getAllDegrees")
    public List<Degree> getAllDegrees() {
        return degreeService.getAllDegrees();
    }

    // to get by id.
    @GetMapping("/getDegreeById/{id}")
    public Degree getDegreeById(@PathVariable int id) {
        return degreeService.getDegreeById(id);
    }

    // for update.
    @PutMapping("/updateDegree")
    public Degree updateDegree(@RequestBody Degree degree) {
        return degreeService.updateDegree(degree);
    }

    // delete
    @DeleteMapping("/deleteDegree/{id}")
    public String deleteDegree(@PathVariable int id) {
        return degreeService.deleteDegree(id);
    }

}
