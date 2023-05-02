package com.ust.sharathtaxi.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Car {
    @Id
    @GeneratedValue
    private long id;
    private String cid;
    private String cname;
    private int prize;
    private String brand;
    private String colour;
    private int seats;
    private String status;

}
