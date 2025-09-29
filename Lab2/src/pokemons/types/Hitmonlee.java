package pokemons.types;

import pokemons.attacks.Facade;
import pokemons.attacks.LowSweep;
import pokemons.attacks.MegaKick;
import pokemons.attacks.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Hitmonlee extends Pokemon {
    public Hitmonlee(String name, int level) {
        super(name, level);
        super.setStats(50, 120, 53, 35, 110, 87);
        super.setType(Type.FIGHTING);

        Facade facade = new Facade();
        LowSweep lowSweep = new LowSweep();
        Swagger swagger = new Swagger();
        MegaKick megaKick = new MegaKick();

        super.setMove(facade, lowSweep, swagger, megaKick);
    }
}
