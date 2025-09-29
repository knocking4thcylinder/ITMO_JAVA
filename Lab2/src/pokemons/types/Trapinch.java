package pokemons.types;

import pokemons.attacks.Confide;
import pokemons.attacks.FeintAttack;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Trapinch extends Pokemon {
    public Trapinch(String name, int level) {
        super(name, level);
        super.setStats(45, 100, 45, 45, 45, 10);
        super.setType(Type.GROUND);
 
        Confide confide = new Confide();
        FeintAttack feintAttack = new FeintAttack();

        super.setMove(confide, feintAttack);
    }
}
