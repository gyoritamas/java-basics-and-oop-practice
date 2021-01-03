package com.codecool.plants;

public class ParabokorPlant extends Plant {

    public ParabokorPlant(Planet planet) {
        super(planet);
    }

    @Override
    public String getName() {
        return "Parabokor";
    }

    protected void setNutrientAmount(String radiation) {
        if (radiation.equals("Alpha") || radiation.equals("Delta")) {
            changeNutrientAmount(1);
        } else {
            changeNutrientAmount(-1);
        }
    }

    @Override
    protected void setRadiationDemand() {
        // none
    }
}
