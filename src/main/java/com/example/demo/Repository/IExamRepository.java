package com.example.demo.Repository;

import com.example.demo.Model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IExamRepository extends JpaRepository<Exam,Long> {

    public Optional<Exam> findById(Long id);

    public void createExam(Exam exam);

    public Exam getByClassId(long id);

}
