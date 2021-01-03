package com.codecool.monsterrace;

public abstract class Racer {
    protected Race race;
    protected String name;
    protected int waterLeft;
    protected int waterCapacity;
    protected boolean isAlive;
    protected int distanceTaken;

    public Racer(Race race) {
        this.race = race;
        race.addRacer(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getDistanceTaken() {
        return this.distanceTaken;
    }

    public int getWaterLeft() {
        return Math.max(this.waterLeft, 0);
    }

    protected void setWaterCapacity(int capacity) {
        this.waterCapacity = capacity;
    }

    public void changeWaterLeft(int amount) {
        this.waterLeft = Math.min(waterLeft + amount, waterCapacity);
    }

    public void advance(int distance) {
        this.distanceTaken += distance;
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    private void setAlive() {
        this.isAlive = waterLeft > 0;
    }

    public void update(String weather) {
        setAlive();
        setWaterLeft(weather);
        move(weather);
    }

    public void printRacer() {
        System.out.printf("%15s | %15s | %10d | %10d%n", this.getName(), this.getClass().getSimpleName(), this.getDistanceTaken(), this.getWaterLeft());
    }

    public abstract void setWaterLeft(int initialValue);

    protected abstract void setWaterLeft(String weather);

    protected abstract void move(String weather);

}
