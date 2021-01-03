package com.codecool.monsterrace;

public class SzivacsRacer extends Racer {

    public SzivacsRacer(Race race) {
        super(race);
        setWaterCapacity(20);
    }

    @Override
    public void setWaterLeft(int initialAmount) {
        changeWaterLeft(initialAmount);
    }

    @Override
    protected void setWaterLeft(String weather) {
        switch (weather) {
            case "n":
                changeWaterLeft(-4);
                break;
            case "f":
                changeWaterLeft(-1);
                break;
            case "e":
                changeWaterLeft(6);
        }
    }

    @Override
    protected void move(String weather) {
        switch (weather) {
            case "n":
                advance(0);
                break;
            case "f":
                advance(1);
                break;
            case "e":
                advance(3);
        }
    }
}
