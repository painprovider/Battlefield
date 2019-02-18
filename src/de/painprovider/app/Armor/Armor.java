package de.painprovider.app.Armor;

import de.painprovider.app.material.Material;

public abstract class Armor {

    private int quantity;

    public abstract void crafted();

    public abstract void armorType();

    public abstract int getArmorModifier(Material mat);





}