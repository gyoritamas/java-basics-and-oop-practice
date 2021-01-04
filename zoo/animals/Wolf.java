package com.codecool.zoo.animals;

import com.codecool.zoo.Animal;
import com.codecool.zoo.Food;
import com.codecool.zoo.Zoo;

public class Wolf extends Animal {

    public Wolf(Zoo zoo) {
        super(zoo);
        setMaxWeight(6);
    }

    @Override
    public void feed(Food food) {
        switch (food) {
            case MEAT:
                changeWeight(3);
                break;
            case VEGETABLES:
            case FRUIT:
                changeWeight(-1);
                break;
            default:
                changeWeight(0);
        }
    }
}
