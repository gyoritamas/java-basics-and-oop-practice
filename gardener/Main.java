package com.codecool.gardener;

import com.codecool.gardener.plants.*;

import static com.codecool.gardener.Nutrient.*;

public class Main {
    public static void main(String[] args) {
        Garden greenGarden = new Garden();
        new Flower(greenGarden, "V102", 3);
        new Bush(greenGarden, "B223", 4);
        new Cactus(greenGarden, "K15", 2);
        new Cactus(greenGarden, "K18", 1);

        greenGarden.addNutrient(WATER);
        greenGarden.addNutrient(NUTRIENT_SOLUTION);
        greenGarden.addNutrient();
        greenGarden.addNutrient(WATER);
        greenGarden.addNutrient(FERTILIZER);

        printInitialState(greenGarden);
        spendDaysInTheGarden(greenGarden, 5);
    }

    public static void printInitialState(Garden garden) {
        System.out.println("Day 0");
        garden.printPlants();
    }

    public static void spendDaysInTheGarden(Garden garden, int numberOfDays) {
        for (int i = 1; i <= numberOfDays; i++) {
            System.out.println("Day " + i);
            garden.oneDayInTheGarden();
        }
    }
}
