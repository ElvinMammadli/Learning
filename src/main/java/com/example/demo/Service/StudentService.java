package com.example.demo.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepository iStudentRepository;

    public StudentService(IStudentRepository iStudentRepository) {
        this.iStudentRepository = iStudentRepository;
    }

    public void save(Student student){
        iStudentRepository.save(student);
    }

    public Student findByUsername(String username) throws Exception{
        return iStudentRepository.findByUsername(username);
    }
    public List<Student> findUsers(){return iStudentRepository.findAll();}

    public Student findByUsernameAndPassword(String username, String password) {
        return iStudentRepository.findByUsernameAndPassword(username, password);
    }
    public  void deleteUser(Long id) {
        iStudentRepository.deleteById(id);
    }


}
