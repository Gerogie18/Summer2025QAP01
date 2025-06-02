package JenniferLyver.Summer2025QAP01.mechanics.combat.actions;

import JenniferLyver.Summer2025QAP01.mechanics.entity.Entity;

public class DefendAction implements CombatActions {

    @Override
    public void perform(Entity attacker, Entity defender) {
        // Defender defends: boost defense for one turn
        int originalDefense = defender.getBaseDefense();
        int boostedDefense = (int)(originalDefense * 1.5);

        defender.setBaseDefense(boostedDefense);
        System.out.println("Defender braces for impact. Defense temporarily increased to " + boostedDefense);

        // Optional: revert defense after one attack if implementing turn-based logic
    }
}
