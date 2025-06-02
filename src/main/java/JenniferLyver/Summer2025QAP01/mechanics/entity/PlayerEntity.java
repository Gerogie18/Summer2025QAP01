package JenniferLyver.Summer2025QAP01.mechanics.entity;

import JenniferLyver.Summer2025QAP01.utils.ValidationUtils;

public class PlayerEntity extends Entity{
    private int playerLevel;
    private int playerExperience;
    private int experienceToNextLevel;

    public PlayerEntity(String name, int hitPoints, int defense, int attackSpeed, int baseStrength, int baseMagic, int playerLevel) {
        super(name, hitPoints, defense, attackSpeed, baseStrength, baseMagic);
        ValidationUtils.validatePositiveValue(playerLevel, "Player Level");
        this.playerLevel = playerLevel;
        this.experienceToNextLevel = calculateExperienceForNextLevel();
    }

    public void gainExperience(int experiencePoints) {
        ValidationUtils.validatePositiveValue(experiencePoints, "Experience Points");
        this.playerExperience += experiencePoints;
        if (playerExperience >= experienceToNextLevel) {
            int excessExperience = playerExperience - experienceToNextLevel;
            levelUp();
            this.playerExperience = excessExperience;
        }
    }

    private void levelUp() {
        this.playerLevel++;
        this.experienceToNextLevel = calculateExperienceForNextLevel();
        this.setBaseStrength(getBaseStrength() + 1);
    }

    public int calculateExperienceForNextLevel() {
        // Calculate experience required for level, increasing at a rate of level^1.5
        // Multiply by 100 to scale experience values, then round down to nearest multiple of 5
        //slower than quadratic, but also scales proportionally.
        return (int) Math.floor(100 * Math.pow(playerLevel + 1, 1.5) / 5) * 5;
    }

    public int getPlayerLevel() {
        return playerLevel;
    }

    public void setPlayerLevel(int playerLevel) {
        this.playerLevel = playerLevel;
    }

    public int getPlayerExperience() {
        return playerExperience;
    }

    public void setPlayerExperience(int playerExperience) {
        ValidationUtils.validatePositiveValue(playerExperience, "Player Experience");
        this.playerExperience = playerExperience;
    }

    public int getExperienceToNextLevel() {
        return experienceToNextLevel;
    }

    public void setExperienceToNextLevel(int experienceToNextLevel) {
        ValidationUtils.validatePositiveValue(experienceToNextLevel, "Experience to Next Level");
        this.experienceToNextLevel = experienceToNextLevel;
    }
}