package pokemons.types;

import pokemons.attacks.Discharge;

import ru.ifmo.se.pokemon.Type;

public final class PorygonZ extends Porygon2 {
    public PorygonZ(String name) {
        super(name);
        super.setType(Type.NORMAL);
        super.setStats(85, 80, 70, 135, 75, 90);

        Discharge discharge = new Discharge();

        super.addMove(discharge);
    }
}
