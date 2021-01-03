package com.codecool.monsterrace;

import java.util.ArrayList;

public class Race {
    private String currentWeather;
    private String weatherForecast;
    private final ArrayList<Racer> racers = new ArrayList<>();

    public void setWeatherForecast(String weatherForecast) {
        this.weatherForecast = weatherForecast;
    }

    public void addRacer(Racer racer) {
        racers.add(racer);
    }

    public void removeRacer(Racer racer) {
        int i = racers.indexOf(racer);
        if (i >= 0) racers.remove(i);
    }

    private void setCurrentWeather(String weather) {
        this.currentWeather = weather;
    }

    private String getCurrentWeather(){
        return this.currentWeather;
    }

    public void printCurrentWeather() {
        switch (getCurrentWeather()) {
            case "n":
                System.out.println(", sunny");
                break;
            case "f":
                System.out.println(", cloudy");
                break;
            case "e":
                System.out.println(", rainy");
        }
    }

    public void notifyRacers() {
        for (int i = 0; i < racers.size(); i++) {
            Racer racer = (Racer) racers.get(i);
            racer.update(currentWeather);
            if (!racer.isAlive()) removeRacer(racer);
        }
    }

    public void advanceOneDay(String dailyWeather) {
        setCurrentWeather(dailyWeather);
        printCurrentWeather();
        notifyRacers();
        for (Racer racer : racers) {
            racer.printRacer();
        }
    }

    public void doRace() {
        for (int i = 0; i < weatherForecast.length(); i++) {
            System.out.printf("Day %d", i + 1);
            advanceOneDay(String.valueOf(weatherForecast.charAt(i)));
        }
    }

    public Racer getWinner() {
        int longestDistanceTaken = 0;
        Racer winner = null;
        for (int i = 0; i < racers.size(); i++) {
            Racer racer = (Racer) racers.get(i);
            if (racer.getDistanceTaken() >= longestDistanceTaken) {
                winner = racer;
                longestDistanceTaken = winner.getDistanceTaken();
            }
        }
        return winner;
    }

}
