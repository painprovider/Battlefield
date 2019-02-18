package de.painprovider.app.Armor;

import de.painprovider.app.material.Material;

public class Robes extends Armor{

    public int armorModifier;

    public Robes(Material mat) {
        this.armorModifier = mat.getArmorModifier();
    }

    @Override
    public void crafted() {

    }

    @Override
    public void armorType() {

    }

    public void setArmorModifier(Material mat) {
        this.armorModifier = mat.getArmorModifier();

    }

    @Override
    public int getArmorModifier(Material mat) {
        return armorModifier;
    }
}
