package pokemons.types;

import pokemons.attacks.DefenseCurl;
import pokemons.attacks.Discharge;
import pokemons.attacks.IceBeam;
import pokemons.attacks.ShadowBall;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class PorygonZ extends Pokemon {
    public PorygonZ(String name) {
        super(name, 135);
        super.setType(Type.NORMAL);
        super.setStats(85, 80, 70, 135, 75, 90);

        IceBeam iceBeam = new IceBeam();
        ShadowBall shadowBall = new ShadowBall();
        DefenseCurl defenseCurl = new DefenseCurl();
        Discharge discharge = new Discharge();

        super.setMove(iceBeam, shadowBall, defenseCurl, discharge);
    }
}
