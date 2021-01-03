package com.codecool.plants;

public class Main {
    public static void main(String[] args) {
        Planet planetZero = new Planet();
        PuffancsPlant puffancs = new PuffancsPlant(planetZero);
        DeltafaPlant deltafa = new DeltafaPlant(planetZero);
        ParabokorPlant parabokor = new ParabokorPlant(planetZero);

        spendDaysOnThePlanet(planetZero, 10);
    }

    public static void spendDaysOnThePlanet(Planet planet, int days){
        for (int i = 1; i <= days; i++) {
            System.out.printf("Day %d%n", i);
            planet.oneDayOnThePlanet();
        }
    }
}
