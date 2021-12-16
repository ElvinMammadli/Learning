package com.example.demo.Service;

import com.example.demo.Model.Student;
import com.example.demo.Model.Teacher;
import com.example.demo.Repository.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    ITeacherRepository iTeacherRepository;

    public TeacherService(ITeacherRepository iTeacherRepository) {
        this.iTeacherRepository = iTeacherRepository;
    }

    public void save(Teacher teacher){
        iTeacherRepository.save(teacher);
    }

    public Teacher findByUsername(String username) throws Exception{
        return iTeacherRepository.findByUsername(username);
    }

    public Teacher findTeacherById(Long id) throws Exception{
        return iTeacherRepository.findTeacherById(id);
    }


    public List<Teacher> findUsers(){return iTeacherRepository.findAll();}

    public Teacher findByUsernameAndPassword(String username, String password) {
        return iTeacherRepository.findByUsernameAndPassword(username, password);
    }
    public  void deleteUser(Long id) {
        iTeacherRepository.deleteById(id);
    }

}
