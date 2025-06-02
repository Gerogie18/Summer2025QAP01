package JenniferLyver.Summer2025QAP01;

import JenniferLyver.Summer2025QAP01.mechanics.entity.PlayerEntity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerEntityTest {

    @Test
    public void testConstructorInitializesCorrectly() {
        PlayerEntity player = new PlayerEntity("Slime", 100, 10, 1, 10, 10, 1);
        assertEquals("Slime", player.getPlayerLevel());
        assertEquals(0, player.getPlayerExperience());
        assertTrue(player.getExperienceToNextLevel() > 0);
    }

    @Test
    public void testGainExperienceWithoutLevelUp() {
        PlayerEntity player = new PlayerEntity("Slime", 100, 10, 1, 10, 10, 1);
        int expToLevel = player.getExperienceToNextLevel();
        player.gainExperience(expToLevel - 1);
        assertEquals(expToLevel - 1, player.getPlayerExperience());
        assertEquals(1, player.getPlayerLevel());
    }

    @Test
    public void testGainExperienceTriggersLevelUpWithNoOverflow() {
        PlayerEntity player = new PlayerEntity("Slime", 100, 10, 1, 10, 10, 1);
        int expToLevel = player.getExperienceToNextLevel();
        player.gainExperience(expToLevel);

        assertEquals(2, player.getPlayerLevel());
        assertEquals(0, player.getPlayerExperience());
        assertTrue(player.getExperienceToNextLevel() > expToLevel);
        assertEquals(11, player.getBaseStrength()); // +1 strength
    }

    @Test
    public void testGainExperienceTriggersLevelUpWithOverflow() {
        PlayerEntity player = new PlayerEntity("Slime", 100, 10, 1, 10, 10, 1);
        int expToLevel = player.getExperienceToNextLevel();
        player.gainExperience(expToLevel + 50);

        assertEquals(2, player.getPlayerLevel());
        assertEquals(50, player.getPlayerExperience());
        assertEquals(11, player.getBaseStrength());
    }

    @Test
    public void testMultipleLevelUpsIfExperienceIsHighEnough() {
        PlayerEntity player = new PlayerEntity("Slime", 100, 10, 1, 10, 10, 1);
        int firstLevelExp = player.getExperienceToNextLevel();
        player.gainExperience(firstLevelExp + 1000); // Should level up at least once

        assertTrue(player.getPlayerLevel() >= 2);
        assertTrue(player.getBaseStrength() >= 11); // increased with each level
    }

    @Test
    public void testCalculateExperienceToNextLevelIncreases() {
        PlayerEntity player = new PlayerEntity("Slime", 100, 10, 1, 10, 10, 1);
        int level1Exp = player.getExperienceToNextLevel();
        player.setPlayerLevel(2);
        player.setExperienceToNextLevel(player.calculateExperienceForNextLevel());
        int level2Exp = player.getExperienceToNextLevel();
        assertTrue(level2Exp > level1Exp);
    }

    @Test
    public void testInvalidExperienceGainThrowsException() {
        PlayerEntity player = new PlayerEntity("slime", 100, 10, 1, 10, 10, 1);
        assertThrows(IllegalArgumentException.class, () -> player.gainExperience(0));
        assertThrows(IllegalArgumentException.class, () -> player.gainExperience(-10));
    }

    @Test
    public void testSettersValidation() {
        PlayerEntity player = new PlayerEntity("slime", 100, 10, 1, 10, 10, 1);

        assertThrows(IllegalArgumentException.class, () -> player.setPlayerExperience(-1));
        assertThrows(IllegalArgumentException.class, () -> player.setExperienceToNextLevel(0));
    }
}
