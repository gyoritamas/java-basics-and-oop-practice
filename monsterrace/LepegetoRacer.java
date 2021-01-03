package com.codecool.monsterrace;

public class LepegetoRacer extends Racer {

    public LepegetoRacer(Race race) {
        super(race);
        setWaterCapacity(12);
    }

    @Override
    public void setWaterLeft(int initialValue) {
        changeWaterLeft(initialValue);
    }

    @Override
    protected void setWaterLeft(String weather) {
        switch (weather) {
            case "n":
                changeWaterLeft(-2);
                break;
            case "f":
                changeWaterLeft(-1);
                break;
            case "e":
                changeWaterLeft(3);
        }
    }

    @Override
    protected void move(String weather) {
        switch (weather) {
            case "n":
            case "e":
                advance(1);
                break;
            case "f":
                advance(2);
                break;
        }
    }
}
