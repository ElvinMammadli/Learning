package com.example.demo.Controller;

import com.example.demo.Model.Exam;
import com.example.demo.Model.Result;
import com.example.demo.Service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class ResultController {


    @Autowired
    ResultService resultService;

    @PostMapping("/api/1/result/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Result result) {
        resultService.save(result);
    }

    @GetMapping("/api/1/result/{id}")
    public Optional<Result> getExamById(@PathVariable Long id){
        return resultService.findById(id);
    }

    @GetMapping("/api/1/result/all")
    public List<Result> findAll(){
        return resultService.findAll();
    }



}
