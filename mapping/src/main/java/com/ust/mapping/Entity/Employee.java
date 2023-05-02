package com.ust.mapping.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private long emp_id;
    private String emp_name;

    public Employee(long emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }

    public Employee() {
    }

    public long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }
    @ManyToMany
    @JoinTable(name = "emp_pro",
            joinColumns= @JoinColumn(name="empid"),
            inverseJoinColumns = @JoinColumn(name="pro_id")
    )
    private Set<Project> assignedProject=new HashSet<>();
}
