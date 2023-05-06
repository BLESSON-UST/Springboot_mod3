package com.ust.realestate.Entity;

import javax.persistence.*;

@Entity
@Table(name = "realtor_data")
public class Realestate {
    @Id
    @GeneratedValue
    private int ID;
    private String status ;
    private double bed ;
    private double bath ;
    private double acre_lot ;
    private String city ;
    private String state ;
    @Column(name = "zip_code")
    private double zipcode ;
    private String house_size ;
    private String prev_sold_date ;
    private double price ;

    public Realestate(String status, double bed, double bath, double acre_lot, String city, String state, double zipcode, String house_size, String prev_sold_date, double price) {
        this.status = status;
        this.bed = bed;
        this.bath = bath;
        this.acre_lot = acre_lot;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.house_size = house_size;
        this.prev_sold_date = prev_sold_date;
        this.price = price;
    }

    public Realestate() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getBed() {
        return bed;
    }

    public void setBed(double bed) {
        this.bed = bed;
    }

    public double getBath() {
        return bath;
    }

    public void setBath(double bath) {
        this.bath = bath;
    }

    public double getAcre_lot() {
        return acre_lot;
    }

    public void setAcre_lot(double acre_lot) {
        this.acre_lot = acre_lot;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getZipcode() {
        return zipcode;
    }

    public void setZipcode(double zipcode) {
        this.zipcode = zipcode;
    }

    public String getHouse_size() {
        return house_size;
    }

    public void setHouse_size(String house_size) {
        this.house_size = house_size;
    }

    public String getPrev_sold_date() {
        return prev_sold_date;
    }

    public void setPrev_sold_date(String prev_sold_date) {
        this.prev_sold_date = prev_sold_date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

