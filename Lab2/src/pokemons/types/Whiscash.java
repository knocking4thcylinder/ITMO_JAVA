package pokemons.types;

import pokemons.attacks.Amnesia;
import pokemons.attacks.Blizzard;
import pokemons.attacks.Scald;
import pokemons.attacks.Tickle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Whiscash extends Pokemon {
    public Whiscash(String name) {
        super(name, 143);
        super.setType(Type.WATER, Type.GROUND);
        super.setStats(110, 78, 73, 76, 71, 60);

        Blizzard blizzard = new Blizzard();
        Amnesia amnesia = new Amnesia();
        Scald scald = new Scald();
        Tickle tickle = new Tickle();

        super.setMove(blizzard, amnesia, scald, tickle);
    }
}
