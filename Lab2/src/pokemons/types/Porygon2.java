package pokemons.types;

import pokemons.attacks.DefenseCurl;
import pokemons.attacks.IceBeam;
import pokemons.attacks.ShadowBall;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Porygon2 extends Pokemon {
    public Porygon2(String name) {
        super(name, 135);
        super.setType(Type.NORMAL);
        super.setStats(85, 80, 90, 105, 95, 60);

        IceBeam iceBeam = new IceBeam();
        ShadowBall shadowBall = new ShadowBall();
        DefenseCurl defenseCurl = new DefenseCurl();

        super.setMove(iceBeam, shadowBall, defenseCurl);
    }
}
