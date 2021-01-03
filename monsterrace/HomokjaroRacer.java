package com.codecool.monsterrace;

public class HomokjaroRacer extends Racer {

    public HomokjaroRacer(Race race) {
        super(race);
        setWaterCapacity(8);
    }

    public void setWaterLeft(int initialAmount) {
        changeWaterLeft(initialAmount);
    }

    @Override
    protected void setWaterLeft(String weather) {
        switch (weather) {
            case "n":
                changeWaterLeft(-1);
                break;
            case "f":
                changeWaterLeft(0);
                break;
            case "e":
                changeWaterLeft(3);
        }
    }

    @Override
    protected void move(String weather) {
        switch (weather) {
            case "n":
                advance(3);
                break;
            case "f":
                advance(1);
                break;
            case "e":
                advance(0);
        }
    }
}
