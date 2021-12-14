package com.example.demo.Repository;

import com.example.demo.Model.Classes;
import com.example.demo.Model.Exam;
import com.example.demo.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IClassRepository extends JpaRepository<Classes,Long> {
    List<Classes> findAllByTeacherId(Long id);

    List<Classes> findAllByStudentsId(Long id);

    List<Student> getStudentsById(Long id);

    List<Exam> getExamsById(Long id);
}
