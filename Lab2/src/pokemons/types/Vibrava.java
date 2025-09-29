package pokemons.types;

import pokemons.attacks.BugBuzz;
import pokemons.attacks.Confide;
import pokemons.attacks.FeintAttack;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Vibrava extends Pokemon {
    public Vibrava(String name, int level) {
        super(name, level);
        super.setStats(50, 70, 50, 50, 50, 70);
        super.setType(Type.GROUND, Type.DRAGON);
 
        Confide confide = new Confide();
        FeintAttack feintAttack = new FeintAttack();
        BugBuzz bugBuzz = new BugBuzz();

        super.setMove(confide, feintAttack, bugBuzz);
    }
}
