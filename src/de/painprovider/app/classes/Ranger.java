package de.painprovider.app.classes;

import de.painprovider.app.entities.CharacterAbilities;

public class Ranger extends CharacterAbilities implements ClassDefaults {
    int level;

    public Ranger(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(strength, dexterity, constitution, intelligence, wisdom, charisma);
    }

    @Override
    public void setBaseAttackBonus() {

    }

    @Override
    public int getBaseAttackBonus() {
        return getLevel();
    }

    @Override
    public int attackRoll() {
        return 0;
    }

    @Override
    public int attackBonus() {
        return 0;
    }

    @Override
    public int armorClass() {
        return 0;
    }

    @Override
    public int setExperience() {
        return 0;
    }

    @Override
    public int getExperience() {
        return 0;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return this.level;
    }
}
