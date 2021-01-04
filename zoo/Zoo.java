package com.codecool.zoo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Zoo {
    Food dailyFood;
    private final LinkedList<Food> menu = new LinkedList<>();
    ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        int i = animals.indexOf(animal);
        if (i >= 0) animals.remove(i);
    }

    public void spendOneDay() {
        removeDeadAnimals();
        setDailyFood();
        printDailyFood();
        feedAnimals();
        printAnimals();
    }

    public void addToMenu(Food food) {
        menu.add(food);
    }

    public void setDailyFood() {
        if (menu.isEmpty()) {
            throw new RuntimeException("Out of food");
        }
        this.dailyFood = menu.removeFirst();
    }

    public void printDailyFood() {
        System.out.printf(", today's menu: %s%n", dailyFood.toString());
    }

    public Food getDailyFood() {
        return this.dailyFood;
    }

    public void feedAnimals() {
        for (int i = 0; i < animals.size(); i++) {
            Animal animal = (Animal) animals.get(i);
            animal.feed(getDailyFood());
            if (!animal.isAlive()) removeAnimal(animal);
        }
    }

    public void printAnimals() {
        System.out.printf("%8s | %10s | %3s%n", "name", "class", "weight");
        for (Animal animal : animals) {
            System.out.printf("%8s | %10s | %3d%n", animal.getName(), animal.getClass().getSimpleName(), animal.getWeight());
        }
    }

    public void removeDeadAnimals() {
        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            if (!animal.isAlive()) removeAnimal(animal);
        }
    }
}
