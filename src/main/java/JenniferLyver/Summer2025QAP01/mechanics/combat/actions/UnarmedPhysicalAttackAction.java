package JenniferLyver.Summer2025QAP01.mechanics.combat.actions;

import JenniferLyver.Summer2025QAP01.mechanics.entity.Entity;

public class UnarmedPhysicalAttackAction implements CombatActions {

    @Override
    public void perform(Entity attacker, Entity defender) {
        int damage = attacker.getBaseStrength() - defender.getBaseDefense();
        if (damage < 0) damage = 0;

        int newHP = defender.getBaseHitPoints() - damage;
        defender.setBaseHitPoints(Math.max(0, newHP));

        System.out.println("Attacker dealt " + damage + " damage. Defender HP is now " + defender.getBaseHitPoints());
    }
}
