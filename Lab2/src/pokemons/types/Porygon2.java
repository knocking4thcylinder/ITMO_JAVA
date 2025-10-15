package pokemons.types;

import pokemons.attacks.DefenseCurl;
import pokemons.attacks.IceBeam;
import pokemons.attacks.ShadowBall;

import ru.ifmo.se.pokemon.Type;

public sealed class Porygon2 extends Porygon permits PorygonZ {
    public Porygon2(String name) {
        super(name);
        super.setType(Type.NORMAL);
        super.setStats(85, 80, 90, 105, 95, 60);

        DefenseCurl defenseCurl = new DefenseCurl();

        super.addMove(defenseCurl);
    }
}
