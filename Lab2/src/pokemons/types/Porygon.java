package pokemons.types;

import pokemons.attacks.IceBeam;
import pokemons.attacks.ShadowBall;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public sealed class Porygon extends Pokemon permits Porygon2 {
    public Porygon(String name) {
        super(name, 135);
        super.setType(Type.NORMAL);
        super.setStats(65, 60, 70, 85, 75, 40);

        IceBeam iceBeam = new IceBeam();
        ShadowBall shadowBall = new ShadowBall();

        super.setMove(iceBeam, shadowBall);
    }
}
