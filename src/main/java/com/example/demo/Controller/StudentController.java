package com.example.demo.Controller;

import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    private static final Logger log = LoggerFactory.getLogger(StudentController.class);

    @PostMapping("/api/1/student/login")
    public Student validateStudent(@RequestBody Student requestedStudent) throws Exception {
        Student student=studentService.findByUsername(requestedStudent.getUsername());
        if(student==null){
            throw new Exception("User not found");
        }
        else{
            if(student.getPassword().equals(requestedStudent.getPassword())){
                return student;
            }
            else {
                throw new Exception("Wrong Password");
            }
        }
    }


    @PostMapping("/api/1/student/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudent(@RequestBody Student requestedStudent) {
        studentService.save(requestedStudent);
    }




}
