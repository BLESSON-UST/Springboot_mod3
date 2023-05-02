package com.ust.stream.Service;

import com.speedment.jpastreamer.application.JPAStreamer;
import com.ust.stream.Entity.Student;

import com.ust.stream.Entity.Student$;
import com.ust.stream.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class StudentService {
    @Autowired
    private StudentRepo repo;
    @Autowired
    private JPAStreamer jpaStreamer;

    public List<Student> submit(List<Student> student) {
        return repo.saveAll(student);
    }


    public long getstudentcount(String courses) {
        Predicate<Student> count= course -> course.getCourses().contains(courses);
        return jpaStreamer.stream(Student.class)
                .filter(count)
                .count();
    }
    public List<Student> getall() {
        return repo.findAll();
    }

    public List<Student> getbylocation(String location) {
        return jpaStreamer.stream(Student.class)
                .filter(Student$.location.equal(location))
                .collect(Collectors.toList());

    }
}
