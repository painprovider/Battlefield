package de.painprovider.app.entities;

// int random = (int)(Math.random() * 50 + 1);

import de.painprovider.app.Armor.Armor;
import de.painprovider.app.Armor.Robes;
import de.painprovider.app.items.Item;
import de.painprovider.app.material.Material;
import de.painprovider.app.weapon.Sword;
import de.painprovider.app.weapon.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int baseAttackroll;
    private int baseHP;
    private int level;
    private int attackroll;
    private String charClass;
    private int experience;
    public Weapon weapon;
    public Armor armor;
    private List<Item> inventory = new ArrayList<>();

    public Player(int level, String charClass){
        this.level = level;
        this.charClass = charClass;
        this.experience = level * 1000;
        this.weapon = new Sword(new Material("Crapium", 1, 1));
        this.armor = new Robes(new Material("Crapium", 1, 1));
        setBaseAttackroll();
        setBaseHP();
    }



    public void setWeapon(Weapon w) {
        this.weapon = w;
    }

    public Weapon getWeapon() {
        return this.weapon;
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
        LevelUp();
    }

    private void LevelUp() {
        this.level = experience / 1000;

    }




}
