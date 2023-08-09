package lk.southernit.uwugpacalculator.Service;


import jakarta.persistence.Column;
import lk.southernit.uwugpacalculator.Entity.Subject;
import lk.southernit.uwugpacalculator.Repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepo subjectRepo;

    // to insert single record.
    public Subject saveSubject(Subject subject) {
        return subjectRepo.save(subject);
    }

    // to insert list.
    public List<Subject> saveSubjectList(List<Subject> subjects) {
        return subjectRepo.saveAll(subjects);
    }

    // to read all.
    public List<Subject> getAllSubjects() {
        return subjectRepo.findAll();
    }

    // for getting details by id.
    public Subject getSubjectById(int id) {
        return subjectRepo.findById(id).orElse(null);
    }

    // for update.
    public Subject updateSubject(Subject subject) {
        Subject tempSubject = subjectRepo.findById(subject.getId()).orElse(null);
        if (tempSubject != null) {
            tempSubject.setUniversityId(subject.getUniversityId());
            tempSubject.setDegreeId(subject.getDegreeId());
            tempSubject.setSemesterId(subject.getSemesterId());
            tempSubject.setSubjectCode(subject.getSubjectCode());
            tempSubject.setSubjectName(subject.getSubjectName());
            tempSubject.setDefaultCredits(subject.getDefaultCredits());
            tempSubject.setApproved(subject.isApproved());
            tempSubject.setAddedById(subject.getAddedById());
            tempSubject.setApprovedById(subject.getApprovedById());

            subjectRepo.save(tempSubject);
            return tempSubject;
        }
        return null;
    }

    // delete
    public String deleteSubject(int id) {
        if (subjectRepo.existsById(id)) {
            subjectRepo.deleteById(id);
            return "Deleted";
        }
        return "Invalid delete request.";
    }
}
