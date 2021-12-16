package com.example.demo.Service;

import com.example.demo.Model.Classes;
import com.example.demo.Model.Exam;
import com.example.demo.Model.Student;
import com.example.demo.Repository.IClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {

    @Autowired
    IClassRepository iClassRepository;

    public ClassService(IClassRepository iClassRepository) {
        this.iClassRepository = iClassRepository;
    }

    public void save(Classes clas){

        iClassRepository.save(clas);
    }


    public List<Classes> findClasses(){return iClassRepository.findAll();}


    public  void deleteClass(Long id) {
        iClassRepository.deleteById(id);
    }





    public List<Classes> getClassesByTeacherId(Long id) throws Exception {
         List<Classes> classes=iClassRepository.findAll();
        if(classes==null){
            throw new Exception("You haven't got any class yet");
        }
        else return iClassRepository.findAllByTeacherId(id);
    }

    public List<Classes> getClassesByStudentsId(Long id) throws Exception {
        List<Classes> classes=iClassRepository.findAll();
        if(classes==null){
            throw new Exception("You haven't got any class yet");
        }
        else return iClassRepository.findAllByStudentsId(id);
    }

    public List<Student> getStudentsById(Long id) {
        return iClassRepository.getStudentsById(id);
    }

    public List<Exam> getExamsById(Long id){
        return iClassRepository.getExamsById(id);
    }
}
