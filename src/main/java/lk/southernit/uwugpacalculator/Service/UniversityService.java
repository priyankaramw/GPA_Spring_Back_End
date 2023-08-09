package lk.southernit.uwugpacalculator.Service;


import jakarta.persistence.Column;
import lk.southernit.uwugpacalculator.Entity.University;
import lk.southernit.uwugpacalculator.Repository.UniversityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityService {

    @Autowired
    private UniversityRepo universityRepo;

    // to insert single record.
    public University saveUniversity(University university) {
        return universityRepo.save(university);
    }

    // to insert list.
    public List<University> saveUniversityList(List<University> university) {
        return universityRepo.saveAll(university);
    }

    // to read all.
    public List<University> getAllUniversities() {
        return universityRepo.findAll();
    }

    // for getting details by id.
    public University getUniversityById(int id) {
        return universityRepo.findById(id).orElse(null);
    }

    // for update.
    public University updateUniversity(University university) {
        University tempUniversity = universityRepo.findById(university.getId()).orElse(null);
        if (tempUniversity != null) {
            tempUniversity.setUniversityName(university.getUniversityName());
            tempUniversity.setSlGovUni(university.isSlGovUni());
            tempUniversity.setCountryCode(university.getCountryCode());
            tempUniversity.setAddedById(university.getAddedById());

            universityRepo.save(tempUniversity);
            return tempUniversity;
        }
        return null;
    }

    // delete
    public String deleteUniversity(int id) {
        if (universityRepo.existsById(id)) {
            universityRepo.deleteById(id);
            return "Deleted";
        }
        return "Invalid delete request.";
    }
}
