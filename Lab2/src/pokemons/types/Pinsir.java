package pokemons.types;

import pokemons.attacks.SeismicToss;
import pokemons.attacks.StormThrow;
import pokemons.attacks.Superpower;
import pokemons.attacks.SwordsDance;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Pinsir extends Pokemon {
    public Pinsir(String name, int level) {
        super(name, level);
        super.setStats(65, 125, 100, 55, 70, 85);
        super.setType(Type.BUG);

        SeismicToss seismicToss = new SeismicToss();
        Superpower superpower = new Superpower();
        SwordsDance swordsDance = new SwordsDance();
        StormThrow stormThrow = new StormThrow();

        super.setMove(seismicToss, superpower, swordsDance, stormThrow);
    }
}
