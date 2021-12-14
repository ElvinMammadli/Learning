package com.example.demo.Controller;

import com.example.demo.Model.Classes;
import com.example.demo.Service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ClassController {

    @Autowired
    ClassService classService;

    @PostMapping("/api/1/class/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudent(@RequestBody Classes requestedClass) {
        classService.save(requestedClass);
    }

    @GetMapping("/api/1/class/{id}")
    public  List<Classes>  getClassByTeacherId(@PathVariable Long id) throws Exception {
        List<Classes> classes  =classService.getReservationsByTeacherId(id);
        return (List<Classes>)classes;
    }

}