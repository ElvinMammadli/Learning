package com.example.demo.Repository;

import com.example.demo.Model.Exam;
import com.example.demo.Model.Result;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IResultRepository extends JpaRepository<Result,Long> {



}
