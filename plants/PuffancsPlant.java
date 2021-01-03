package com.codecool.plants;

public class PuffancsPlant extends Plant {

    public PuffancsPlant(Planet planet) {
        super(planet);
    }

    @Override
    public String getName() {
        return "Puffancs";
    }

    @Override
    public void setAlive() {
        this.isAlive = getNutrientAmount() > 0 && getNutrientAmount() <= 10;
    }

    @Override
    protected void setNutrientAmount(String radiation) {
        if (radiation.equals("Alpha")) {
            changeNutrientAmount(2);
        } else if (radiation.equals("Delta")) {
            changeNutrientAmount(-2);
        } else {
            changeNutrientAmount(-1);
        }
    }

    @Override
    protected void setRadiationDemand() {
        planet.setAlphaRadiationDemand(10 - getNutrientAmount());
    }

}
