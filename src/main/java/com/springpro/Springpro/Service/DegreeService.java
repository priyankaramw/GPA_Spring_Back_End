package com.springpro.Springpro.Service;

import com.springpro.Springpro.Entity.Degree;
import com.springpro.Springpro.Repository.DegreeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DegreeService {

    @Autowired
    private DegreeRepo DegreeRepo;

    // to insert single record.
    public Degree saveDegree(Degree degree) {
        return DegreeRepo.save(degree);
    }

    // to insert list.
    public List<Degree> saveDegreeList(List<Degree> degrees) {
        return DegreeRepo.saveAll(degrees);
    }

    // to read all.
    public List<Degree> getAllDegrees() {
        return DegreeRepo.findAll();
    }

    // for getting details by id.
    public Degree getDegreeById(int id) {
        return DegreeRepo.findById(id).orElse(null);
    }

    // for update.
    public Degree updateDegree(Degree degree) {
        Degree tempDegree = DegreeRepo.findById(degree.getId()).orElse(null);
        if (tempDegree != null) {

            tempDegree.setDepartment(degree.getDepartment());
            tempDegree.setFaculty(degree.getFaculty());
            tempDegree.setDegreeCode(degree.getDegreeCode());
            tempDegree.setDegreeName(degree.getDegreeName());
            tempDegree.setUniversityId(degree.getUniversityId());
            tempDegree.setSemesterCount(degree.getSemesterCount());

            DegreeRepo.save(tempDegree);
            return tempDegree;
        }
        return null;
    }

    // delete
    public String deleteDegree(int id) {
        if (DegreeRepo.existsById(id)) {
            DegreeRepo.deleteById(id);
            return "Deleted";
        }
        return "Invalid delete request.";
    }
}
