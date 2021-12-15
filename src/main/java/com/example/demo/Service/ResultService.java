package com.example.demo.Service;

import com.example.demo.Model.Result;
import com.example.demo.Model.Student;
import com.example.demo.Repository.IResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResultService {
    @Autowired
    IResultRepository iResultRepository;

    public ResultService(IResultRepository iResultRepository){
        this.iResultRepository=iResultRepository;
    }

    public Optional<Result> findById(Long id){
        return iResultRepository.findById(id);
    }

    public void save(Result result){
        iResultRepository.save(result);
    }


    public List<Result> findAll() {
        return iResultRepository.findAll();
    }

}
