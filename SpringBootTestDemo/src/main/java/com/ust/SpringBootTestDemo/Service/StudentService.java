package com.ust.SpringBootTestDemo.Service;

import com.ust.SpringBootTestDemo.Entity.Student;
import com.ust.SpringBootTestDemo.Exception.StudentNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
    Student submit(Student student);

    List<Student> getall();

    Student getbyid(Integer id) throws StudentNotFoundException;

    List<Student> getbyname(String name);

    Student deletebyid(Integer id) throws StudentNotFoundException;
}
