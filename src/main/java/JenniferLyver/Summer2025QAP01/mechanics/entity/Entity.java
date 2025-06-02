package JenniferLyver.Summer2025QAP01.mechanics.entity;

import JenniferLyver.Summer2025QAP01.utils.ValidationUtils;

public abstract class Entity {
    private int name;
    private int hitPoints;
    private int defense;
    private int attackSpeed;
    private int baseStrength;
    private int baseMagic;

    public Entity(int name, int hitPoints, int defense, int attackSpeed, int baseStrength, int baseMagic) {
        this.name = name;
        ValidationUtils.validatePositiveValue(hitPoints, "Hit Points");
        this.hitPoints = hitPoints;
        ValidationUtils.validatePositiveValue(defense, "Defense");
        this.defense = defense;
        ValidationUtils.validatePositiveValue(attackSpeed, "Attack Speed");
        this.attackSpeed = attackSpeed;
        ValidationUtils.validatePositiveValue(baseStrength, "Base Strength");
        this.baseStrength = baseStrength;
        ValidationUtils.validatePositiveValue(baseMagic, "Base Magic");
        this.baseMagic = baseMagic;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        ValidationUtils.validatePositiveValue(hitPoints, "Hit Points");
        this.hitPoints = hitPoints;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        ValidationUtils.validatePositiveValue(defense, "Defense");
        this.defense = defense;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        ValidationUtils.validatePositiveValue(attackSpeed, "Attack Speed");
        this.attackSpeed = attackSpeed;
    }

    public int getBaseStrength() {
        return baseStrength;
    }

    public void setBaseStrength(int baseStrength) {
        ValidationUtils.validatePositiveValue(baseStrength, "Base Strength");
        this.baseStrength = baseStrength;
    }

    public int getBaseMagic() {
        return baseMagic;
    }

    public void setBaseMagic(int baseMagic) {
        ValidationUtils.validatePositiveValue(baseMagic, "Base Magic");
        this.baseMagic = baseMagic;
    }
}
