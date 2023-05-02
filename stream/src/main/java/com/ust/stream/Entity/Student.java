package com.ust.stream.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Cacheable
public class Student {
    @Id
    @GeneratedValue
    private int studentId;
    private String studentName;
    private String email;
    private String phoneNo;
    private String qualification;
    private String experience;
    @ElementCollection
    private List<String> courses;
    private String location;
    private String comment;

}
