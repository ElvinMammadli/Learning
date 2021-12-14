package com.example.demo.Controller;

import com.example.demo.Model.Exam;
import com.example.demo.Service.ExamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class ExamController {

    @Autowired
    ExamService examService;

    private static final Logger log = LoggerFactory.getLogger(ExamController.class);

    @PostMapping("/api/1/exam/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Exam exam) {
        examService.save(exam);
    }

    @GetMapping("/api/1/exam/{id}")
    public Optional<Exam> getExamById(@PathVariable Long id){
        return examService.findById(id);
    }


}
