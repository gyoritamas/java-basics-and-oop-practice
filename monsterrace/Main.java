package com.codecool.monsterrace;

public class Main {
    public static void main(String[] args) {
        Race monsterRace = new Race();
        monsterRace.setWeatherForecast("nffeeennf");
        Racer vandor = new HomokjaroRacer(monsterRace);
        vandor.setName("Vandor");
        vandor.setWaterLeft(4);
        Racer seta = new LepegetoRacer(monsterRace);
        seta.setName("Seta");
        seta.setWaterLeft(7);
        Racer csuszo = new SzivacsRacer(monsterRace);
        csuszo.setName("Csuszo");
        csuszo.setWaterLeft(12);
        Racer siklo = new SzivacsRacer(monsterRace);
        siklo.setName("Siklo");
        siklo.setWaterLeft(10);

        System.out.printf("%15s | %15s | %10s | %10s%n", "name", "class", "distance", "water left");
        monsterRace.doRace();
        // print winner:
        String winnerName = monsterRace.getWinner().getName();
        System.out.printf("The winner is: %s%n", winnerName);
    }
}
