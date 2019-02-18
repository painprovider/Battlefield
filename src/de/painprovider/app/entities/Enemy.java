package de.painprovider.app.entities;

public class Enemy {

    private int baseAttackroll;
    private int baseHP;
    private int level;
    private int attackroll;
    private String charClass;
    public int experience;
    private boolean isDead;

    public Enemy(int level, String charClass, int experience) {
        this.level = level;
        this.charClass = charClass;
        this.experience = experience;
        setBaseAttackroll();
        setBaseHP();
    }
    public void setIsDead()  {
        if (this.baseHP <= 0) {
            this.isDead = true;
        } else {
            this.isDead = false;
        }
    }

    public boolean getIsDead () {
        return this.isDead;
    }


    public int getBaseAttackroll() {
        return this.baseAttackroll;
    }

    public void setBaseAttackroll() {
        if (charClass.equals("Wizard")) {
            this.baseAttackroll = (2 * getLevel()) / 2;
        } else if (charClass.equals("Fighter")) {
            this.baseAttackroll = (5 * getLevel()) / 2;
        } else {
            System.out.println("Could not recognize valid Characterclass, please check the params on " + Enemy.this);
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
            System.out.println("Could not recognize valid Characterclass, please check the params on " + Enemy.this);
        }
    }

    public void setBaseHP(int baseHP) {
        this.baseHP = baseHP;
    }

    public void setBaseHP(Player player) {
        this.baseHP = this.baseHP - player.getAttackroll();

    }

    public int getLevel() {
        return level;
    }

    public void setAttackroll() {
        this.attackroll = baseAttackroll + (int) (Math.random() * 50 + 1); // random nr between 1-50
    }

    public int getAttackroll() {
        return attackroll;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}

