package com.codecool.gardener.plants;

import com.codecool.gardener.Garden;
import com.codecool.gardener.Nutrient;
import com.codecool.gardener.Plant;

public class Bush extends Plant {

    public Bush(Garden garden, String id, int size) {
        super(garden, id, size);
    }

    @Override
    public int getMaxSize() {
        return 10;
    }

    @Override
    public void feedPlant(Nutrient nutrient) {
        switch (nutrient){
            case WATER:
            case FERTILIZER:
                changeSize(1);
                break;
            case NUTRIENT_SOLUTION:
            default:
                changeSize(-1);
                break;
        }
    }
}
