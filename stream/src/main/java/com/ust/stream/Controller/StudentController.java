package com.ust.stream.Controller;

import com.ust.stream.Entity.Student;
import com.ust.stream.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stu")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/save")
    public List<Student> submit(@RequestBody List<Student> student)
    {
        return studentService.submit(student);
    }
    @GetMapping("/get/{courses}")
    public long getstudentcount(@RequestParam String  courses)
    {
        return studentService.getstudentcount(courses);
    }
    @GetMapping("/retrieve")
    public List<Student> getall()
    {
        return studentService.getall();
    }
    @GetMapping("/getby/{location}")
    public List<Student> getbylocation(@PathVariable String location)
    {
        return studentService.getbylocation(location);
    }


}
