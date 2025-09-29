package pokemons.types;

import pokemons.attacks.BugBuzz;
import pokemons.attacks.Confide;
import pokemons.attacks.FeintAttack;
import pokemons.attacks.RockSlide;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Flygon extends Pokemon {
    public Flygon(String name, int level) {
        super(name, level);
        super.setStats(80, 100, 80, 80, 80, 100);
        super.setType(Type.GROUND, Type.DRAGON);
 
        Confide confide = new Confide();
        FeintAttack feintAttack = new FeintAttack();
        BugBuzz bugBuzz = new BugBuzz();
        RockSlide rockSlide = new RockSlide();

        super.setMove(confide, feintAttack, bugBuzz, rockSlide);
    }
}
