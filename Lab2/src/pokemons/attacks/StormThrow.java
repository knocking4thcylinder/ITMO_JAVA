package pokemons.attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class StormThrow extends PhysicalMove {
    public StormThrow() {
        super(Type.FIGHTING, 60, 100);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return 1.5;
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length - 1];
    }
}
