Implement Clean Code Practices:
Apply the following principles as you write your code:

Meaningful Names:
Use descriptive names like playerCharacter, enemyCharacter, initialHealth, calculateDamage, applyDamage.
Avoid names like p, e, hp, atk.
Functions Should Do One Thing:
Ensure each method has a single responsibility. For example, takeDamage should only reduce health, not also print combat logs or check if the character is dead. That could be handled by performAttack or CombatSystem.
Clarity Over Comments:
Write self-documenting code. If a section of code is complex, try to simplify it or break it into smaller, well-named methods first.
Use comments sparingly, only for why a particular design choice was made, not what the code does (e.g., // Using a floor function to ensure damage is never negative, aligning with game mechanics).