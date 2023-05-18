package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vegetables {
    @Id
    @GeneratedValue
    private int vid;
    private String vname;
    private String vprize;

    public Vegetables(int vid, String vname, String vprize) {
        this.vid = vid;
        this.vname = vname;
        this.vprize = vprize;
    }

    public Vegetables() {
    }

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getVprize() {
        return vprize;
    }

    public void setVprize(String vprize) {
        this.vprize = vprize;
    }
}
