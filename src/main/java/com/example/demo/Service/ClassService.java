package com.example.demo.Service;

import com.example.demo.Model.Classes;
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
            throw new Exception("You haven't got any reservation yet");
        }
        else return iClassRepository.findAllByTeacherId(id);
    }

    public List<Classes> getClassesByStudentId(Long id) throws Exception {
        List<Classes> classes=iClassRepository.findAll();
        if(classes==null){
            throw new Exception("You haven't got any reservation yet");
        }
        else return iClassRepository.findAllByStudentId(id);
    }
}
