package com.ust.SpringBootTestDemo.Service;

import com.ust.SpringBootTestDemo.Entity.Student;
import com.ust.SpringBootTestDemo.Exception.StudentNotFoundException;
import com.ust.SpringBootTestDemo.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StudentServiceimpl implements StudentService{
    @Autowired
    private StudentRepo repo;
    @Override
    public Student submit(Student student) {
        return repo.save(student);
    }

    @Override
    public List<Student> getall() {
        return repo.findAll();
    }

    @Override
    public Student getbyid(Integer id) throws StudentNotFoundException {
        Optional<Student> s=repo.findById(id);
        if(!s.isPresent()){
            throw new StudentNotFoundException("Student with id :" +id +"doesn't exist");
        }
        return(s.get());

    }


    @Override
    public List<Student> getbyname(String name) {
        return repo.findByName(name);
    }

    @Override
    public Student deletebyid(Integer id) throws StudentNotFoundException{
        Optional<Student> s=repo.findById(id);
        if(!s.isPresent()){
            throw new StudentNotFoundException("Student with id :" +id +"doesn't exist");
        }
        repo.deleteById(id);
        return s.get();
    }



}
