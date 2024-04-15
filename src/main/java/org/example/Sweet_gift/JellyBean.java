package org.example.Sweet_gift;

public class JellyBean extends Candy {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    @Override
    public void printInfo() {
        System.out.println("Сладость: " + getName() + ", Вес: " + getWeight() + " г, Цена: " + getPrice() + " руб., Цвет: " + color);
    }
}