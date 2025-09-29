package pokemons.attacks;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.PhysicalMove;

public final class MegaKick extends PhysicalMove {
    public MegaKick() {
        super(Type.NORMAL, 120, 75);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length - 1];
    }
}
