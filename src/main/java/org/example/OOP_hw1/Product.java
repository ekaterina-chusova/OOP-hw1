package org.example.OOP_hw1;

public class Product {
    private String product;
    private double volume;



    public Product(){
    }

    public Product(String product, double volume) {
        this.product = product;
        this.volume = volume;

    }

    public String getProduct() {
        return product;
    }
    public double getVolume() {
        return volume;
    }

}

