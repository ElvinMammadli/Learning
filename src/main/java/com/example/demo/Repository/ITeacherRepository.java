package com.example.demo.Repository;

import com.example.demo.Model.Student;
import com.example.demo.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITeacherRepository extends JpaRepository<Teacher,Long> {
    Teacher findByUsername(String username);

    Teacher findByUsernameAndPassword(String username, String password);

}
