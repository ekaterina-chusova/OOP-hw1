package org.example.OOP_hw1;

/*
Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
и реализовать перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */

public class Main {
    public static void main(String[] args) {
        HotDrink espresso = new  HotDrink("espresso", 0.2, 70, 100);
        HotDrink tea = new  HotDrink("tea", 0.4, 90, 40);
        HotDrink capuchino = new  HotDrink("capuchino", 0.5, 50, 150);
        HotDrink latte = new  HotDrink("latte", 0.5, 50, 200);
        HotDrinkVendingMachine hotDrVenMach = new HotDrinkVendingMachine();
        hotDrVenMach.addHotDrinks(espresso);
        hotDrVenMach.addHotDrinks(tea);
        hotDrVenMach.addHotDrinks(capuchino);
        hotDrVenMach.addHotDrinks(latte);

        System.out.println(hotDrVenMach.getHotDrinks());

        hotDrVenMach.shopHotDrinks();
    }
}
