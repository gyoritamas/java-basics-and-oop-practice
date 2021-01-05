package com.codecool.gardener.plants;

import com.codecool.gardener.Garden;
import com.codecool.gardener.Nutrient;
import com.codecool.gardener.Plant;

public class Flower extends Plant {

    public Flower(Garden garden, String id, int size) {
        super(garden, id, size);
    }

    @Override
    public int getMaxSize() {
        return 6;
    }

    @Override
    public void feedPlant(Nutrient nutrient) {
        switch (nutrient) {
            case WATER:
                changeSize(3);
                break;
            case NUTRIENT_SOLUTION:
            case FERTILIZER:
            default:
                changeSize(-1);
                break;
        }
    }
}
