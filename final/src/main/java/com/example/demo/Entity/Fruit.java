package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fruit {
    @Id
    @GeneratedValue
    private int id;
    private String fname;
    private String fprize;

    public Fruit(int id, String fname, String fprize) {
        this.id = id;
        this.fname = fname;
        this.fprize = fprize;
    }

    public Fruit() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFprize() {
        return fprize;
    }

    public void setFprize(String fprize) {
        this.fprize = fprize;
    }
}
