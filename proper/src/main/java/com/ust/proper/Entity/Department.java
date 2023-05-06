package com.ust.proper.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {
    @Id
//    @GeneratedValue
    private int id;
    private String dname;

    public Department(int id, String dname) {
        this.id = id;
        this.dname = dname;
    }

    public Department() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    private List<Employee> employees = new ArrayList<>();
}
