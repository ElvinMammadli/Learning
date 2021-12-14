package com.example.demo.Controller;

import com.example.demo.Model.Student;
import com.example.demo.Model.Teacher;
import com.example.demo.Service.StudentService;
import com.example.demo.Service.TeacherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    private static final Logger log = LoggerFactory.getLogger(TeacherController.class);

    @PostMapping("/api/1/teacher/login")
    public Teacher validateTeacher(@RequestBody Teacher requestedTeacher) throws Exception {
        Teacher teacher=teacherService.findByUsername(requestedTeacher.getUsername());
        if(teacher==null){
            throw new Exception("User not found");
        }
        else{
            if(teacher.getPassword().equals(requestedTeacher.getPassword())){
                return teacher;
            }
            else {
                throw new Exception("Wrong Password");
            }
        }
    }


    @PostMapping("/api/1/teacher/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createTeacher(@RequestBody Teacher teacherRequested) {
        teacherService.save(teacherRequested);
    }







}
