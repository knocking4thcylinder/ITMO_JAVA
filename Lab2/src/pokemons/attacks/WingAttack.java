package pokemons.attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class WingAttack extends PhysicalMove {
    public WingAttack() {
        super(Type.FLYING, 60, 100);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length - 1];
    }
}
