package JenniferLyver.Summer2025QAP01.mechanics.combat;

import JenniferLyver.Summer2025QAP01.mechanics.entity.Entity;
import JenniferLyver.Summer2025QAP01.mechanics.combat.actions.CombatActions;

public class Combat {

    public static void executeCombatRound(Entity attacker, Entity defender, CombatActions action) {
        if (attacker == null || defender == null || action == null) {
            throw new IllegalArgumentException("Attacker, defender, and action must not be null.");
        }

        // Perform the action
        action.perform(attacker, defender);

        // Check for defeat = defender
        if (defender.getBaseHitPoints() <= 0) {
            System.out.println(defender.getClass().getSimpleName() + " has been defeated!");
            // Optional: end combat, trigger loot, XP, etc.
        }

        //check for defeat = attackers
        if (attacker.getBaseHitPoints() <= 0) {
            System.out.println(attacker.getClass().getSimpleName() + " has been defeated!");
        }

        System.out.println("Attacker HP: " + attacker.getBaseHitPoints());
        System.out.println("Defender HP: " + defender.getBaseHitPoints());
    }
}
