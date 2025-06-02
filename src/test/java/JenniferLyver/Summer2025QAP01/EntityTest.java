package JenniferLyver.Summer2025QAP01;

import JenniferLyver.Summer2025QAP01.mechanics.entity.Entity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Dummy concrete subclass for testing Entity
class TestEntity extends Entity {
    public TestEntity(int name, int hitPoints, int defense, int attackSpeed, int baseStrength, int baseMagic) {
        super(name, hitPoints, defense, attackSpeed, baseStrength, baseMagic);
    }
}

public class EntityTest {

    @Test
    public void testValidConstructor() {
        TestEntity entity = new TestEntity(1, 100, 20, 5, 10, 15);
        assertNotNull(entity);
    }

    @Test
    public void testSettersWithValidValues() {
        TestEntity entity = new TestEntity(1, 100, 20, 5, 10, 15);
        entity.setHitPoints(120);
        entity.setDefense(25);
        entity.setAttackSpeed(6);
        entity.setBaseStrength(12);
        entity.setBaseMagic(18);

        // If no exceptions are thrown, test passes
        assertTrue(true);
    }

    @Test
    public void testSettersWithInvalidValues() {
        TestEntity entity = new TestEntity(1, 100, 20, 5, 10, 15);

        assertThrows(IllegalArgumentException.class, () -> entity.setHitPoints(0));
        assertThrows(IllegalArgumentException.class, () -> entity.setDefense(-1));
        assertThrows(IllegalArgumentException.class, () -> entity.setAttackSpeed(0));
        assertThrows(IllegalArgumentException.class, () -> entity.setBaseStrength(-5));
        assertThrows(IllegalArgumentException.class, () -> entity.setBaseMagic(0));
    }

    @Test
    public void testConstructorWithInvalidValues() {
        assertThrows(IllegalArgumentException.class, () -> new TestEntity(1, -10, 20, 5, 10, 15));
        assertThrows(IllegalArgumentException.class, () -> new TestEntity(1, 100, 0, 5, 10, 15));
        assertThrows(IllegalArgumentException.class, () -> new TestEntity(1, 100, 20, -1, 10, 15));
        assertThrows(IllegalArgumentException.class, () -> new TestEntity(1, 100, 20, 5, 0, 15));
        assertThrows(IllegalArgumentException.class, () -> new TestEntity(1, 100, 20, 5, 10, -3));
    }
}

