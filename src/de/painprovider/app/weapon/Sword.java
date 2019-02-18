package de.painprovider.app.weapon;

import de.painprovider.app.material.Material;

public class Sword extends Weapon {
    private int damageModifier;
    private boolean setAsWeapon;

    public Sword(Material mat) {
        this.damageModifier = mat.getDamageModifier();
    }

    @Override
    public void crafted() {

    }

    @Override
    public void damageType() {

    }


    public int getDamageModifier(Material mat) {
        return this.damageModifier;
    }

    private void setDamageModifier(Material mat) {
        this.damageModifier = mat.getDamageModifier();
    }

    public int getDamageModifier() {
        return this.damageModifier;
    }
}
