package com.codecool.gardener;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Garden {
    private List<Plant> plants = new ArrayList<>();
    private LinkedList<Nutrient> nutrients = new LinkedList<>();

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void removePlant(Plant plant) {
        int i = plants.indexOf(plant);
        if (i >= 0) plants.remove(i);
    }

    public void addNutrient(Nutrient nutrient) {
        nutrients.add(nutrient);
    }

    public void addNutrient() {
        nutrients.add(null);
    }

    public Nutrient getNutrient() {
        return nutrients.removeFirst();
    }

    public void feedPlants() {
        Nutrient nutrient = getNutrient();
        for (int i = 0; i < plants.size(); i++) {
            Plant plant = (Plant) plants.get(i);
            if (nutrient != null)
                plant.feedPlant(nutrient);
            else
                plant.feedPlant();
            if (!plant.isAlive()) removePlant(plant);
        }
    }

    public void printPlants() {
        for (Plant plant : plants) {
            plant.printPlant();
        }
    }

    public void oneDayInTheGarden() {
        feedPlants();
        printPlants();
    }

}
