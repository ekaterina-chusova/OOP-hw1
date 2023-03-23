package org.example.OOP_hw1;

public class HotDrink extends Product {

    int temperature;
    int price;

    public HotDrink(String product, double volume, int temperature, int price) {
        super(product, volume);
        this.temperature = temperature;
        this.price = price;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\n\ndrink = " + super.getProduct() + "\nvolume = " + super.getVolume() + "\ntemperature = " + temperature + "\nprice = " + price ;
    }

}
