package com.example.demo.Repository;

import com.example.demo.Model.Classes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IClassRepository extends JpaRepository<Classes,Long> {
    List<Classes> findAllByTeacherId(Long id);

    List<Classes> findAllByStudentId(Long id);
}
