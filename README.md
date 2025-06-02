# QAP Submission

## 1. Clean Code Practices

### Example 1: Descriptive names

```java
public abstract class Entity {
    private int name;
    private int baseHitPoints;
    private int baseDefense;
    private int baseAttackSpeed;
    private int baseStrength;
    private int baseMagic;
```

**Explanation:** the use of base**** helps to differentiate from any changes made from status effects, items, etc.

### Example 2: Abstraction:  Action interface

```java

public interface CombatActions {
    void perform (Entity Attacker, Entity Defender);
}

```

**Explanation:** By implementing an interface it forms a contract of what a combat action is, an action taken on the defender.  Even if it is an action performed on the self many game systems will allow for debuffs, etc.  so the defender matters.

### Example 3: Defensive Parameter coding:

**Java**

```java
public Entity(int name, int baseHitPoints, int baseDefense, int baseAttackSpeed, int baseStrength, int baseMagic) {
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
```

**Explanation:** Object 

---

## 2. Project Explanation and Test Cases

### Project Overview

* **What it does:** A simple mock up of a player / enemy entity and some combat actions.  Not enough yet for a combat system but enough to think about code archetecture.
* **How it works:** Currently it does not, but there is enough code to test.  Close to being a 1 on 1 battle.

### Test Cases Used

* Comprehensive unit tests on the entity classes.

---

## 3. Needed Dependencies

* Started project with [Spring Boost](https://docs.spring.io/spring-boot/maven-plugin/using.html "Spring Boost Docs"), a resource reccomended by Jordan.  So my dependencies are `.springframework.boot:spring-boot-starter`, `org.springframework.boot:spring-boot-starter-test` and `org.springframework.boot:spring-boot-starter-parent`.  

---

## 4. Problems Encountered During QAP

### Lack of Meaningful Resources and Guidance

* Lack of resources by teachers on what exactly we are supposed to be learning weekly.  so when we get assignments its a race to teach yourself based on the resources Jordan has provided.  A simple powerpoint, pdf or notes would be helpful to make sure we know what we are supposed to be reveiwing.  Even a teams post.  Every assignment shouldn't be playing keepup if we were given meaningful resources to reveiw.

---
