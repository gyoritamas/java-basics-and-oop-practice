package com.codecool.kindergarten;

public class Main {
    public static void main(String[] args) {
        Kindergarten littlePonyKindergarten = new Kindergarten();
        littlePonyKindergarten.setHeadcount(6);
        littlePonyKindergarten.addRandomKids(littlePonyKindergarten.getHeadcount());
        littlePonyKindergarten.setRandomActivities(littlePonyKindergarten.getWorkingHours() * 2);

        spendOneDay(littlePonyKindergarten);
    }

    public static void spendOneDay(Kindergarten kindergarten) {
        for (double i = 8; i < 8 + kindergarten.getWorkingHours(); i += 0.5) {
            System.out.print((int) i + ((i % 2 == 0) ? ":00" : ":30"));
            kindergarten.advanceTimeByHalfAnHour();
        }
    }

}
