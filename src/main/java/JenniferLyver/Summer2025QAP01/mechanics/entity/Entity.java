package JenniferLyver.Summer2025QAP01.mechanics.entity;

import JenniferLyver.Summer2025QAP01.utils.ValidationUtils;

public abstract class Entity {
    private String name;
    private int baseHitPoints;
    private int baseDefense;
    private int baseAttackSpeed;
    private int baseStrength;
    private int baseMagic;

    public Entity(String name, int baseHitPoints, int baseDefense, int baseAttackSpeed, int baseStrength, int baseMagic) {
        this.name = name;
        ValidationUtils.validatePositiveValue(baseHitPoints, "Hit Points");
        this.baseHitPoints = baseHitPoints;
        ValidationUtils.validatePositiveValue(baseDefense, "baseDefence");
        this.baseDefense = baseDefense;
        ValidationUtils.validatePositiveValue(baseAttackSpeed, "Attack Speed");
        this.baseAttackSpeed = baseAttackSpeed;
        ValidationUtils.validatePositiveValue(baseStrength, "Base Strength");
        this.baseStrength = baseStrength;
        ValidationUtils.validatePositiveValue(baseMagic, "Base Magic");
        this.baseMagic = baseMagic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseHitPoints() {
        return baseHitPoints;
    }

    public void setBaseHitPoints(int baseHitPoints) {
        ValidationUtils.validatePositiveValue(baseHitPoints, "Hit Points");
        this.baseHitPoints = baseHitPoints;
    }

    public int getBaseDefense() {
        return baseDefense;
    }

    public void setBaseDefense(int baseDefence) {
        ValidationUtils.validatePositiveValue(baseDefence, "baseDefence");
        this.baseDefense = baseDefence;
    }

    public int getBaseAttackSpeed() {
        return baseAttackSpeed;
    }

    public void setBaseAttackSpeed(int baseAttackSpeed) {
        ValidationUtils.validatePositiveValue(baseAttackSpeed, "Attack Speed");
        this.baseAttackSpeed = baseAttackSpeed;
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

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", baseHitPoints=" + baseHitPoints +
                ", baseDefense=" + baseDefense +
                ", baseAttackSpeed=" + baseAttackSpeed +
                ", baseStrength=" + baseStrength +
                ", baseMagic=" + baseMagic +
                '}';
    }
}
