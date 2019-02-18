package de.painprovider.app.weapon;

import de.painprovider.app.material.Material;

public abstract class Weapon {

    private int quantity;

    public abstract void crafted();

    public abstract void damageType();

    public abstract int getDamageModifier();





}