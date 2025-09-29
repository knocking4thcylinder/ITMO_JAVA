package pokemons;

import pokemons.types.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Tyrogue("cool-ass name1", 86);
        Pokemon p2 = new Pinsir("Хищник1", 79);
        Pokemon p3 = new Trapinch("cool-ass name2", 73);
        Pokemon p4 = new Vibrava("Хищник2", 80);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p4);
        b.addFoe(p3);
        b.go();
    }
}
