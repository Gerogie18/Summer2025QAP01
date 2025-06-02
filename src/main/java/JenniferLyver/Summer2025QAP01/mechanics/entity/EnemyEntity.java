package JenniferLyver.Summer2025QAP01.mechanics.entity;

import JenniferLyver.Summer2025QAP01.utils.ValidationUtils;

public class EnemyEntity extends Entity {
    private int experiencePoints;
    private int enemyLevel;

    public EnemyEntity(String name, int hitPoints, int defense, int attackSpeed, int baseStrength, int baseMagic, int experiencePoints, int enemyLevel) {
        super(name, hitPoints, defense, attackSpeed, baseStrength, baseMagic);
        ValidationUtils.validatePositiveValue(experiencePoints, "Experience Points");
        this.experiencePoints = experiencePoints;
        ValidationUtils.validatePositiveValue(enemyLevel, "Enemy Level");
        this.enemyLevel = enemyLevel;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        ValidationUtils.validatePositiveValue(experiencePoints, "Experience Points");
        this.experiencePoints = experiencePoints;
    }

    public int getEnemyLevel() {
        return enemyLevel;
    }

    public void setEnemyLevel(int enemyLevel) {
        ValidationUtils.validatePositiveValue(enemyLevel, "Enemy Level");
        this.enemyLevel = enemyLevel;
    }

    @Override
    public String toString() {
        return "EnemyEntity{" +
                "experiencePoints=" + experiencePoints +
                ", enemyLevel=" + enemyLevel +
                '}';
    }
}