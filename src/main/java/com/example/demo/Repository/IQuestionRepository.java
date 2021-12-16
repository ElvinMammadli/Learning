package com.example.demo.Repository;

import com.example.demo.Model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IQuestionRepository extends JpaRepository<Question,Long> {

    public Question findQuestionById(Long id);


}
