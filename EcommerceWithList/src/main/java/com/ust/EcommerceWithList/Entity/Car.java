package com.ust.EcommerceWithList.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String  date;
    @ElementCollection
    private List<String> colors;
    private String model;
    @ElementCollection
    private List<String> accesories;
    private int price;
    @ElementCollection
    private List<String> payment;
    @ElementCollection
    private List<String> cities;

}
