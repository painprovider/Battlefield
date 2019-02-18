package de.painprovider.app;

import de.painprovider.app.entities.Enemy;
import de.painprovider.app.entities.Player;

public class Battlefield {


    public Battlefield() {};

    public void fightingRound (Player player, Enemy enemy) {

        while (!player.getIsDead() || !enemy.getIsDead()) {

            System.out.println("Enemy  HP :   "  + enemy.getBaseHP());
            player.setAttackroll();
            System.out.println(player.getName() + " does " + player.getAttackroll() + " DAMAGE");
            enemy.setBaseHP(player);
            System.out.println("Enemy new HP :   "  + enemy.getBaseHP());

            enemy.setIsDead();
            if (enemy.getIsDead())
                break;

            System.out.println(player.getName()  + "  HP :   "  + player.getBaseHP());
            enemy.setAttackroll();
            System.out.println("ork does " + enemy.getAttackroll() + " DAMAGE");
            player.setBaseHP(enemy);
            System.out.println(player.getName()  + " new HP :   "  + player.getBaseHP());

            player.setIsDead();
            if (player.getIsDead())
                break;
        }

    }
}
