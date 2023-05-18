package com.example.test.controller;

import com.example.test.model.Student;

import com.example.test.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class Studentcontroller {
   @Autowired
   private StudentRepository studentRepository;
    @PostMapping("/addstudent")
    public ResponseEntity<Student> create(@RequestBody Student student){
        studentRepository.save(student);
        return ResponseEntity.ok().body(student);
    }
    
    @GetMapping("/allstudents")
    public ResponseEntity<List<Student>> getBook(){
        
            return ResponseEntity.ok().body(studentRepository.findAll());
        
    }
    @GetMapping("/student/{id}")
    public ResponseEntity<Optional<Student>> getUser(@PathVariable Long id){
        Optional<Student> student=studentRepository.findById(id);
        if(student ==null)
        {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(student);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Optional<Student>> updateDetails(@RequestBody Student student){
        Optional<Student> existingstudent=studentRepository.findById(student.getId());
        if(existingstudent==null)
        {
            return ResponseEntity.notFound().build();
        }
        else
        {
            Student newstudent=existingstudent.get();
            newstudent.setName(student.getName());
            studentRepository.save(newstudent);
        }
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable long id){
        studentRepository.deleteById(id);
        return ResponseEntity.ok().build();

    }




    }

