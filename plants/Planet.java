package com.codecool.plants;

import java.util.ArrayList;

public class Planet {
    public String dailyRadiation = "none";
    private int alphaRadiationDemand = 0;
    private int deltaRadiationDemand = 0;
    private final ArrayList<Plant> listOfPlants = new ArrayList<>();

    public void addPlant(Plant plant) {
        listOfPlants.add(plant);
    }

    public void removePlant(Plant plant) {
        int i = listOfPlants.indexOf(plant);
        if (i >= 0) listOfPlants.remove(i);
    }

    public void setAlphaRadiationDemand(int amount) {
        this.alphaRadiationDemand += amount;
    }

    public void setDeltaRadiationDemand(int amount) {
        this.deltaRadiationDemand += amount;
    }

    public void oneDayOnThePlanet() {
        printRadiation();
        plantsAlive();
        setRadiation();
        notifyPlants();
    }

    public void notifyPlants() {
        for (int i = 0; i < listOfPlants.size(); i++) {
            Plant plant = (Plant) listOfPlants.get(i);
            plant.update(dailyRadiation);
            if (!plant.isAlive()) removePlant(plant);
        }
    }

    public void setRadiation() {
        if (alphaRadiationDemand > deltaRadiationDemand + 3) {
            this.dailyRadiation = "Alpha";
        } else if (deltaRadiationDemand > alphaRadiationDemand + 3) {
            this.dailyRadiation = "Delta";
        } else {
            this.dailyRadiation = "none";
        }
        resetRadiationDemand();
    }

    private void resetRadiationDemand() {
        this.alphaRadiationDemand = 0;
        this.deltaRadiationDemand = 0;
    }

    public void plantsAlive() {
        for (Plant plant : listOfPlants) {
            System.out.printf("%s (nutrient left: %d)%n", plant.getName(), plant.getNutrientAmount());
        }
    }

    public void printRadiation() {
        System.out.printf("Today's radiation: %s%n", dailyRadiation);
        //System.out.printf("Alpha radiation demand: %d%n", alphaRadiationDemand);
        //System.out.printf("Delta radiation demand: %d%n", deltaRadiationDemand);
    }
}
