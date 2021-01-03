package com.codecool.plants;

public abstract class Plant {
    protected String name;
    protected Planet planet;
    protected int nutrientAmount;
    protected boolean isAlive;

    public Plant(Planet planet){
        this.planet = planet;
        changeNutrientAmount(5);
        planet.addPlant(this);
    }

    public abstract String getName();

    public int getNutrientAmount() {
        return nutrientAmount;
    }

    public void changeNutrientAmount(int nutrientAmount) {
        this.nutrientAmount += nutrientAmount;
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    protected void setAlive() {
        this.isAlive = this.nutrientAmount > 0;
    }

    public void update(String radiation) {
        setAlive();
        reactionToRadiation(radiation);
    }

    protected void reactionToRadiation(String radiation) {
        setNutrientAmount(radiation);
        setRadiationDemand();
    }

    protected abstract void setNutrientAmount(String radiation);

    protected abstract void setRadiationDemand();
}
