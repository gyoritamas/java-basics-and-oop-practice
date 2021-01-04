package com.codecool.zoo;

import com.codecool.zoo.animals.*;

import static com.codecool.zoo.Food.*;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal akela = new Wolf(zoo);
        akela.setName("Akela");
        akela.changeWeight(3);

        Animal balu = new Bear(zoo);
        balu.setName("Balu");
        balu.changeWeight(4);

        Animal tapsi = new Rabbit(zoo);
        tapsi.setName("Tapsi");
        tapsi.changeWeight(2);

        Animal brumi = new Bear(zoo);
        brumi.setName("Brumi");
        brumi.changeWeight(6);

        Animal durum = new Hedgehog(zoo);
        durum.setName("Durum");
        durum.changeWeight(4);

        zoo.addToMenu(MEAT);
        zoo.addToMenu(VEGETABLES);
        zoo.addToMenu(MEAT);
        zoo.addToMenu(FRUIT);
        zoo.addToMenu(MEAT);

        spendSomeDays(zoo, 10);
    }

    public static void spendSomeDays(Zoo zoo, int numberOfDays) {
        for (int i = 1; i <= numberOfDays; i++) {
            System.out.printf("Day %d", i);
            try {
                zoo.spendOneDay();
            } catch (RuntimeException re){
                System.out.println(", " + re.getMessage());
            }
        }
    }
}
