package pokemons.attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class SeismicToss extends PhysicalMove {
    public SeismicToss() {
        super(Type.FIGHTING, 0, 100);
    }

    @Override
    public double calcBaseDamage(Pokemon att, Pokemon def) {
        return att.getLevel();
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length - 1];
    }
}
