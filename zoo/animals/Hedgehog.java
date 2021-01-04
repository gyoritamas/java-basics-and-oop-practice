package com.codecool.zoo.animals;

import com.codecool.zoo.Animal;
import com.codecool.zoo.Food;
import com.codecool.zoo.Zoo;

public class Hedgehog extends Animal {

    public Hedgehog(Zoo zoo) {
        super(zoo);
        setMaxWeight(5);
    }

    @Override
    public void feed(Food food) {
        switch (food) {
            case MEAT:
                changeWeight(-1);
                break;
            case FRUIT:
                changeWeight(2);
                break;
            default:
                changeWeight(0);
        }
    }
}
