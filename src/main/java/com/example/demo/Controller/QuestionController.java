package com.example.demo.Controller;

import com.example.demo.Model.Question;
import com.example.demo.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Collections;
import java.util.List;


public class QuestionController {

    @Autowired
    QuestionService questionService;


    @PostMapping("api/1/question/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createQuestion(Question question){
        questionService.save(question);
    }

    @GetMapping("api/1/question/{id}")
    public Question getQuestionById(@PathVariable Long id){
        return questionService.findQuestionbyId(id);
    }

    @GetMapping("api/1/question/all")
    public List<Question> getAll(){
        List<Question> list =questionService.findAll();
        Collections.shuffle(list);
        return list.subList(0, 10);
    }

}
