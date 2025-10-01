package pokemons;

import pokemons.types.Aerodactyl;
import pokemons.types.Barboach;
import pokemons.types.Porygon2;
import pokemons.types.PorygonZ;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Porygon2("cool-ass name1");
        Pokemon p2 = new Barboach("Хищник1");
        Pokemon p3 = new PorygonZ("cool-ass name2");
        Pokemon p4 = new Aerodactyl("Хищник2");
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p4);
        b.addFoe(p3);
        b.go();
    }
}
