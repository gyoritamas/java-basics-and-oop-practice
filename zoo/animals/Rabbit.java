package com.codecool.zoo.animals;

import com.codecool.zoo.Animal;
import com.codecool.zoo.Food;
import com.codecool.zoo.Zoo;

public class Rabbit extends Animal {

    public Rabbit(Zoo zoo) {
        super(zoo);
        setMaxWeight(4);
    }

    @Override
    public void feed(Food food) {
        switch (food) {
            case MEAT:
                changeWeight(-1);
                break;
            case VEGETABLES:
                changeWeight(2);
                break;
            case FRUIT:
                changeWeight(1);
                break;
            default:
                changeWeight(0);
        }

    }
}
