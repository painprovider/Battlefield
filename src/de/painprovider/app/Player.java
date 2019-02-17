package de.painprovider.app;

import de.painprovider.app.Enemy;

// int random = (int)(Math.random() * 50 + 1);

public class Player {
    private int baseAttackroll;
    private int baseHP;
    private int level;
    private int attackroll;
    private String charClass;
    private int experience;

    public Player(int level, String charClass){
        this.level = level;
        this.charClass = charClass;
        setBaseAttackroll();
        setBaseHP();
    }

    public int getBaseAttackroll() {
        return this.baseAttackroll;
    }

    public void setBaseAttackroll() {
        if (charClass.equals("Wizard")) {
            this.baseAttackroll = 2 * getLevel();
        } else if (charClass.equals("Fighter")) {
            this.baseAttackroll = 5 * getLevel();
        } else {
            System.out.println("Could not recognize valid Characterclass, please check the params on " + Player.this);
        }
    }

    public int getBaseHP() {
        return baseHP;
    }

    public void setBaseHP() {
        if (charClass.equals("Wizard")) {
            this.baseHP = 4 * getLevel();
        } else if (charClass.equals("Fighter")) {
            this.baseHP = 8 * getLevel();
        } else {
            System.out.println("Could not recognize valid Characterclass, please check the params on " + Player.this);
        }
    }

    public int getLevel() {
        return level;
    }

    public void setAttackroll() {
        this.attackroll = baseAttackroll + (int)(Math.random() * 50 + 1); // random nr between 1-50
    }

    public int getAttackroll() {
        return attackroll;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int tempExp) {

        this.experience = this.experience + tempExp;
    }


}
