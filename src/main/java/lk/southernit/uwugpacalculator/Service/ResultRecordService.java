package lk.southernit.uwugpacalculator.Service;

import lk.southernit.uwugpacalculator.Entity.ResultRecord;
import lk.southernit.uwugpacalculator.Repository.ResultRecordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultRecordService {

    @Autowired
    private ResultRecordRepo resultRecordRepo;

    // to insert single record.
    public ResultRecord saveResultRecord(ResultRecord resultRecord) {
        return resultRecordRepo.save(resultRecord);
    }

    // to insert list.
    public List<ResultRecord> saveResultRecordList(List<ResultRecord> resultRecords) {
        return resultRecordRepo.saveAll(resultRecords);
    }

    // to read all.
    public List<ResultRecord> getAllResultRecords() {
        return resultRecordRepo.findAll();
    }

    // for getting details by id.
    public ResultRecord getResultRecordById(int id) {
        return resultRecordRepo.findById(id).orElse(null);
    }

    // for update.
    public ResultRecord updateResultRecord(ResultRecord resultRecord) {
        ResultRecord tempResultRecord = resultRecordRepo.findById(resultRecord.getId()).orElse(null);
        if (tempResultRecord != null) {
            tempResultRecord.setStudentId(resultRecord.getStudentId());
            tempResultRecord.setSemesterId(resultRecord.getSemesterId());
            tempResultRecord.setSubjectId(resultRecord.getSubjectId());
            tempResultRecord.setSubjectCode(resultRecord.getSubjectCode());
            tempResultRecord.setSubjectName(resultRecord.getSubjectName());
            tempResultRecord.setGrade(resultRecord.getGrade());
            tempResultRecord.setCredits(resultRecord.getCredits());
            tempResultRecord.setShouldExclude(resultRecord.isShouldExclude());

            resultRecordRepo.save(tempResultRecord);
            return tempResultRecord;
        }
        return null;
    }

    // delete
    public String deleteResultRecord(int id) {
        if (resultRecordRepo.existsById(id)) {
            resultRecordRepo.deleteById(id);
            return "Deleted";
        }
        return "Invalid delete request.";
    }
}
