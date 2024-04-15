package org.example.Sweet_gift;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Candy {
    private String name;
    private double weight;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public void printInfo() {
        System.out.println("Сладость: " + name + ", Вес: " + weight + " г, Цена: " + price + " руб.");
    }
}