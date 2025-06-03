package org.surotec.ikunaproject.service;

public class Product {

    private String name;
    private String description;
    private double value;

    public Product(){

    }

    public Product(String name, String description, double value){
        this.name=name;
        this.description=description;
        this.value=value;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }
}
