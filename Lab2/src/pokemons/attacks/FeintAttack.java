package pokemons.attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class FeintAttack extends PhysicalMove {
    public FeintAttack() {
        super(Type.DARK, 60, Double.POSITIVE_INFINITY);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length - 1];
    }
}
