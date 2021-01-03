package com.codecool.plants;

public class DeltafaPlant extends Plant {

    public DeltafaPlant(Planet planet) {
        super(planet);
    }

    @Override
    public String getName() {
        return "Deltafa";
    }

    @Override
    protected void setNutrientAmount(String radiation) {
        if (radiation.equals("Alpha")) {
            changeNutrientAmount(-3);
        } else if (radiation.equals("Delta")) {
            changeNutrientAmount(4);
        } else {
            changeNutrientAmount(-1);
        }
    }

    @Override
    protected void setRadiationDemand() {
        if (getNutrientAmount() < 5) {
            planet.setDeltaRadiationDemand(4);
        } else if (getNutrientAmount() >= 5 && getNutrientAmount() <= 10) {
            planet.setDeltaRadiationDemand(1);
        }
    }

}
