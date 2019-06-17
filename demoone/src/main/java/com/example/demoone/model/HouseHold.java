package com.example.demoone.model;

import lombok.Data;

/**
 * @author LiuBingqian
 * @date
 */
@Data
public class HouseHold {
    private String name;
    private Double price;
    private String brand;
    private String specs;

    public HouseHold(String name, Double price, String brand, String specs) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.specs = specs;
    }
}
