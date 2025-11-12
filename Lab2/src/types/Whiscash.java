package types;

import attacks.Tickle;

import ru.ifmo.se.pokemon.Type;

public final class Whiscash extends Barboach {
    public Whiscash(String name) {
        super(name);

        super.setType(Type.WATER, Type.GROUND);
        super.setStats(110, 78, 73, 76, 71, 60);

        Tickle tickle = new Tickle();

        super.addMove(tickle);
    }
}
