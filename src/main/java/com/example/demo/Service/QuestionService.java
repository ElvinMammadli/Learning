package com.example.demo.Service;

import com.example.demo.Model.Question;
import com.example.demo.Repository.IQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService  {

    @Autowired
    IQuestionRepository iQuestionRepository;

    public QuestionService(IQuestionRepository iQuestionRepository) {
        this.iQuestionRepository = iQuestionRepository;
    }

    public void save(Question question){

        iQuestionRepository.save(question);
    }
    public Question findQuestionbyId(Long id){
        return iQuestionRepository.findQuestionById(id);
    }

    public List<Question> getAll(){
        return iQuestionRepository.getAll();
    }

}
