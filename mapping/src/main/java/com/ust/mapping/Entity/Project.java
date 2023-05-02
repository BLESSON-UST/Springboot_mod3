package com.ust.mapping.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PROJECT")
public class Project {
    @Id
    @GeneratedValue
    private long pro_id;
    private String pro_name;

    public Project(long pro_id, String pro_name) {
        this.pro_id = pro_id;
        this.pro_name = pro_name;
    }

    public Project() {
    }

    public long getPro_id() {
        return pro_id;
    }

    public void setPro_id(long pro_id) {
        this.pro_id = pro_id;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }
    @ManyToMany(mappedBy = "assignedProject")
    private Set<Employee> employeeSet=new HashSet<>();
}
