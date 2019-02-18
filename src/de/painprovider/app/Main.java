package de.painprovider.app;

import de.painprovider.app.entities.Enemy;
import de.painprovider.app.entities.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static boolean True;
    private static int enemyCounter = 5;

    public static void main(String[] args) {


        Player bamboozled = new Player(
                1, "Fighter", "Bamboozled");
        Enemy ork = new Enemy(5, "Fighter", 15000);

        Battlefield hell = new Battlefield();

        List<Enemy> enemies = new ArrayList<>(Arrays.asList(
               new Enemy(5, "Fighter", (int)(Math.random() * 500 + 100)),
               new Enemy(5, "Fighter", (int)(Math.random() * 500 + 100)),
               new Enemy(5, "Fighter", (int)(Math.random() * 500 + 100))
        ));

       hell.fightingRound(bamboozled, ork);



























































    }
}