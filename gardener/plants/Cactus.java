package com.codecool.gardener.plants;

import com.codecool.gardener.Garden;
import com.codecool.gardener.Nutrient;
import com.codecool.gardener.Plant;

public class Cactus extends Plant {

    public Cactus(Garden garden, String id, int size) {
        super(garden, id, size);
    }

    @Override
    public int getMaxSize() {
        return 4;
    }

    @Override
    public void feedPlant(Nutrient nutrient) {
        switch (nutrient) {
            case NUTRIENT_SOLUTION:
            case FERTILIZER:
                changeSize(1);
                break;
            case WATER:
            default:
                changeSize(-1);
                break;
        }
    }
}
