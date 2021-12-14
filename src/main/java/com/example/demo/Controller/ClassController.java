package com.example.demo.Controller;

import com.example.demo.Model.Classes;
import com.example.demo.Model.Exam;
import com.example.demo.Model.Student;
import com.example.demo.Service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class ClassController {

    @Autowired
    ClassService classService;

    @PostMapping("/api/1/class/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudent(@RequestBody Classes requestedClass) {
        classService.save(requestedClass);
    }

    @GetMapping("/api/1/class/teacher:{id}")
    public  List<Classes>  getClassByTeacherId(@PathVariable Long id) throws Exception {
        List<Classes> classes  =classService.getClassesByTeacherId(id);
        return classes;
    }

    @GetMapping("/api/1/class/student:{id}")
    public  List<Classes>  getClassByStudentsId(@PathVariable Long id) throws Exception {
        List<Classes> classes  =classService.getClassesByStudentsId(id);
        return classes;
    }


    @GetMapping("/api/1/class/students/class:{id}")
    public  List<Student>  getStudentsById(@PathVariable Long id) throws Exception {
        List<Student> students  =classService.getStudentsById(id);
        return students;
    }

    @GetMapping("api/1/class/exams/class:{id}")
    public List<Exam> getExamsById(@PathVariable Long id) throws Exception{
        return classService.getExamsById(id);
    }

    @GetMapping("api/1/class/exams/student:{id}")
    public List<Exam> getExamsByStudentsId(@PathVariable Long id) throws Exception {
        List<Classes> classes = classService.getClassesByStudentsId(id);
        List<Exam> exams = new ArrayList<>();
        for (Classes currentClass: classes ){
            exams.addAll(classService.getExamsById(currentClass.getId()));
        }
        return exams;
    }
}
