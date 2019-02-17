package de.painprovider.app;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Player Bamboozled = new Player(5, "Fighter");



        System.out.println(Bamboozled.getBaseAttackroll());
        System.out.println(Bamboozled.getBaseHP());

        Bamboozled.setAttackroll();
        System.out.println(Bamboozled.getAttackroll());
        Bamboozled.setAttackroll();
        System.out.println(Bamboozled.getAttackroll());
        Bamboozled.setAttackroll();
        System.out.println(Bamboozled.getAttackroll());


        Enemy ork = new Enemy(4, "Fighter", 4000);

        System.out.println("sdadasdasdasdas");

        System.out.println(Bamboozled.getExperience());

        Bamboozled.setExperience(ork.getExperience());

        System.out.println(Bamboozled.getExperience());

        Bamboozled.setExperience(ork.getExperience());
        Bamboozled.setExperience(ork.getExperience());

        System.out.println(Bamboozled.getExperience());




    }
}