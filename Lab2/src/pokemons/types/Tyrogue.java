package pokemons.types;

import pokemons.attacks.Facade;
import pokemons.attacks.LowSweep;
import pokemons.attacks.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Tyrogue extends Pokemon {
    public Tyrogue(String name, int level) {
        super(name, level);
        super.setStats(35, 35, 35, 35, 35, 35);
        super.setType(Type.BUG);

        Facade facade = new Facade();
        LowSweep lowSweep = new LowSweep();
        Swagger swagger = new Swagger();

        super.setMove(facade, lowSweep, swagger);
    }
}
