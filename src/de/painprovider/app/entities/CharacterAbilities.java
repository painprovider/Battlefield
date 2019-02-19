package de.painprovider.app.entities;

public abstract class CharacterAbilities implements CombatStatistics{

    private boolean isHuman;
    private boolean isDwarf;
    private boolean isElve;
    private boolean isGnome;
    private boolean isHalfOrk;
    private boolean isHalfElve;
    private boolean isHalfling;

    private String size;
    private int landSpeed;

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public CharacterAbilities(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    private int baseAttackBonus;

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public void setHuman(boolean human) {
        isHuman = human;
    }

    public boolean isDwarf() {
        return isDwarf;
    }

    public void setDwarf(boolean dwarf) {
        isDwarf = dwarf;
    }

    public boolean isElve() {
        return isElve;
    }

    public void setElve(boolean elve) {
        isElve = elve;
    }

    public boolean isGnome() {
        return isGnome;
    }

    public void setGnome(boolean gnome) {
        isGnome = gnome;
    }

    public boolean isHalfOrk() {
        return isHalfOrk;
    }

    public void setHalfOrk(boolean halfOrk) {
        isHalfOrk = halfOrk;
    }

    public boolean isHalfElve() {
        return isHalfElve;
    }

    public void setHalfElve(boolean halfElve) {
        isHalfElve = halfElve;
    }

    public boolean isHalfling() {
        return isHalfling;
    }

    public void setHalfling(boolean halfling) {
        isHalfling = halfling;
    }

    public abstract void setBaseAttackBonus();

    public abstract int getBaseAttackBonus();




    public int attributeBonus (int attribute) {
        return (int)Math.floor((attribute - 10) / 2.0);
    }

    public void setHumanModifiers () {
        this.size = "medium";
        this.landSpeed = 30;
    };

    public void setDwarfModifiers () {
        this.size = "medium";
        this.landSpeed = 20;
    };

    public void setElveModifiers () {
        this.size = "medium";
        this.landSpeed = 30;
    };

    public void setGnomeModifiers () {
        this.size = "small";
        this.landSpeed = 20;
    };

    public void setHalfOrkModifiers () {
        this.size = "medium";
        this.landSpeed = 30;
    };

    public void setHalfElveModifiers () {
        this.size = "medium";
        this.landSpeed = 30;
    };

    public void setHalflingModifiers () {
        this.size = "small";
        this.landSpeed = 20;
    };
}
