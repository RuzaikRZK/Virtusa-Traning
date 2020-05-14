package com.practicle.PrototypeDesignPattern;

public class Cow extends Animal {
    private String food;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "food=" + food +
                '}';
    }
}
