package com.codecool.zoo;

public abstract class Animal {
    private Zoo zoo;
    private String name;
    private int weight;
    private int maxWeight;
    private boolean isAlive;

    public Animal(Zoo zoo) {
        this.zoo = zoo;
        zoo.addAnimal(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void changeWeight(int weight) {
        this.weight += weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return this.maxWeight;
    }

    public boolean isAlive() {
        return this.weight > 0 && weight <= this.maxWeight;
    }

    public abstract void feed(Food food);
}
