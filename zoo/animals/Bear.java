package com.codecool.zoo.animals;

import com.codecool.zoo.Animal;
import com.codecool.zoo.Food;
import com.codecool.zoo.Zoo;

public class Bear extends Animal {

    public Bear(Zoo zoo) {
        super(zoo);
        setMaxWeight(10);
    }

    @Override
    public void feed(Food food) {
        switch (food) {
            case MEAT:
            case FRUIT:
                changeWeight(1);
                break;
            case VEGETABLES:
                changeWeight(-1);
                break;
            default:
                changeWeight(0);
        }
    }
}
