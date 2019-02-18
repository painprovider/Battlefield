package de.painprovider.app.material;

public class Material {

    private String name;
    private int damageModifier;
    private int armorModifier;

    public Material(String name, int damageModifier, int armorModifier) {
        this.name = name;
        this.damageModifier = damageModifier;
        this.armorModifier = armorModifier;
    }

    public String getName() {
        return name;
    }

    public int getDamageModifier() {
        return damageModifier;
    }

    public int getArmorModifier() {
        return armorModifier;
    }
}
