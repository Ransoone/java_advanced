package org.example.Sweet_gift;

import java.util.ArrayList;
import java.util.List;


public class GiftBox {
    private List<Candy> candies;

    public GiftBox() {
        candies = new ArrayList<>();
    }

    public void addCandy(Candy candy, int quantity) {
        for (int i = 0; i < quantity; i++) {
            candies.add(candy);
        }
    }

    public double getTotalWeight() {
        double totalWeight = 0;
        for (Candy candy : candies) {
            totalWeight += candy.getWeight();
        }
        return totalWeight;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Candy candy : candies) {
            totalPrice += candy.getPrice();
        }
        return totalPrice;
    }

    public void printGiftInfo() {
        System.out.println("Состав подарка:");
        for (Candy candy : candies) {
            candy.printInfo();
        }
        System.out.println("Общий вес подарка: " + getTotalWeight() + " г");
        System.out.println("Общая стоимость подарка: " + getTotalPrice() + " руб.");
    }
}