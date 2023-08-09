package lk.southernit.uwugpacalculator.Controller;

import lk.southernit.uwugpacalculator.Entity.ResultRecord;
import lk.southernit.uwugpacalculator.Service.ResultRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin  //@CrossOrigin("http://localhost:5173/")
public class ResultRecordController {

    @Autowired
    private ResultRecordService resultRecordService;

    // to insert.
    @PostMapping("/addResultRecord")
    public ResultRecord addResultRecord(@RequestBody ResultRecord resultRecord) {
        return resultRecordService.saveResultRecord(resultRecord);
    }

    // to insert as a list.
    @PostMapping("/addResultRecordList")
    public List<ResultRecord> addResultRecordList(@RequestBody List<ResultRecord> resultRecord) {
        return resultRecordService.saveResultRecordList(resultRecord);
    }

    // to read all.
    @GetMapping("/getAllResultRecords")
    public List<ResultRecord> getAllResultRecords() {
        return resultRecordService.getAllResultRecords();
    }

    // to get by id.
    @GetMapping("/getResultRecordById/{id}")
    public ResultRecord getResultRecordById(@PathVariable int id) {
        return resultRecordService.getResultRecordById(id);
    }

    // for update.
    @PutMapping("/updateResultRecord")
    public ResultRecord updateResultRecord(@RequestBody ResultRecord resultRecord) {
        return resultRecordService.updateResultRecord(resultRecord);
    }

    // delete
    @DeleteMapping("/deleteResultRecord/{id}")
    public String deleteResultRecord(@PathVariable int id) {
        return resultRecordService.deleteResultRecord(id);
    }

}
