package com.example.demo.Service;

import com.example.demo.Model.Exam;
import com.example.demo.Repository.IExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExamService {

    @Autowired
    IExamRepository iExamRepository;

    public ExamService(IExamRepository iExamRepository) {
        this.iExamRepository = iExamRepository;
    }

    public void save(Exam exam){
        iExamRepository.save(exam);
    }

    public Optional<Exam> findById(Long id){
        return iExamRepository.findById(id);
    }

    public List<Exam> findAll() {
        return iExamRepository.findAll();
    }

}
