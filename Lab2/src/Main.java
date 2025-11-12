import types.*;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Porygon2("cool-ass name1");
        Pokemon p2 = new Barboach("Хищник1");
        Pokemon p3 = new PorygonZ("cool-ass name2");
        Pokemon p4 = new Aerodactyl("Хищник2");
        Pokemon p5 = new Whiscash("Whiscash");
        Pokemon p6 = new Porygon("Porygon");
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p4);
        b.addFoe(p3);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
    }
}
