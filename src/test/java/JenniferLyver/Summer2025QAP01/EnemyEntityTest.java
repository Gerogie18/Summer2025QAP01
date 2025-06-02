package JenniferLyver.Summer2025QAP01;

import JenniferLyver.Summer2025QAP01.mechanics.entity.EnemyEntity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnemyEntityTest {

    @Test
    public void testConstructor_ValidValues() {
        EnemyEntity enemy = new EnemyEntity("Slime", 100, 10, 1, 10, 10, 100, 1);
        assertEquals(100, enemy.getExperiencePoints());
        assertEquals(1, enemy.getEnemyLevel());
    }

    @Test
    public void testConstructor_InvalidExperiencePoints() {
        assertThrows(IllegalArgumentException.class, () -> new EnemyEntity("Slime", 100, 10, 1, 10, 10, -1, 1));
    }

    @Test
    public void testConstructor_InvalidEnemyLevel() {
        assertThrows(IllegalArgumentException.class, () -> new EnemyEntity("Slime", 100, 10, 1, 10, 10, 100, -1));
    }

    @Test
    public void testSetExperiencePoints_ValidValue() {
        EnemyEntity enemy = new EnemyEntity("Slime", 100, 10, 1, 10, 10, 100, 1);
        enemy.setExperiencePoints(200);
        assertEquals(200, enemy.getExperiencePoints());
    }

    @Test
    public void testSetExperiencePoints_InvalidValue() {
        EnemyEntity enemy = new EnemyEntity("Slime", 100, 10, 1, 10, 10, 100, 1);
        assertThrows(IllegalArgumentException.class, () -> enemy.setExperiencePoints(-1));
    }

    @Test
    public void testSetEnemyLevel_ValidValue() {
        EnemyEntity enemy = new EnemyEntity("Slime", 100, 10, 1, 10, 10, 100, 1);
        enemy.setEnemyLevel(2);
        assertEquals(2, enemy.getEnemyLevel());
    }

    @Test
    public void testSetEnemyLevel_InvalidValue() {
        EnemyEntity enemy = new EnemyEntity("Slime", 100, 10, 1, 10, 10, 100, 1);
        assertThrows(IllegalArgumentException.class, () -> enemy.setEnemyLevel(-1));
    }

    @Test
    public void testToString() {
        EnemyEntity enemy = new EnemyEntity("Slime", 100, 10, 1, 10, 10, 100, 1);
        String expected = "EnemyEntity{" +
                "experiencePoints=" + 100 +
                ", enemyLevel=" + 1 +
                '}';
        assertEquals(expected, enemy.toString());
    }
}