package pokemons.types;

import pokemons.attacks.Amnesia;
import pokemons.attacks.Blizzard;
import pokemons.attacks.Scald;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Barboach extends Pokemon {
    public Barboach(String name) {
        super(name, 143);
        super.setType(Type.WATER, Type.GROUND);
        super.setStats(50, 48, 43, 46, 41, 60);

        Blizzard blizzard = new Blizzard();
        Amnesia amnesia = new Amnesia();
        Scald scald = new Scald();

        super.setMove(blizzard, amnesia, scald);
    }
}
