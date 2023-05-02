package com.ust.SpringBootTestDemo.Entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @Column(name="ID")
    private Integer id;
    @NotBlank(message="the column shouldn't be blank")
    @Column(name="NAME")
    private String name;
    @Column(name="ADDRESS")
    private String address;
    @Column(name="ROLLNO")
    private String rollno;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", rollno='" + rollno + '\'' +
                '}';
    }
}
