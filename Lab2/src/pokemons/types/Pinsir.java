package pokemons.types;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Pinsir extends Pokemon {
    public Pinsir(String name, int level) {
        super(name, level);
        super.setStats(65, 125, 100, 55, 70, 85);
        super.setType(Type.BUG);
    }
}
