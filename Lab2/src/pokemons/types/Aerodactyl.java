package pokemons.types;

import pokemons.attacks.Crunch;
import pokemons.attacks.DragonClaw;
import pokemons.attacks.RockPolish;
import pokemons.attacks.WingAttack;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Aerodactyl extends Pokemon {
    public Aerodactyl(String name) {
        super(name, 69);
        super.setType(Type.ROCK, Type.FLYING);
        super.setStats(80, 105, 65, 60, 75, 130);

        RockPolish rockPolish = new RockPolish();
        Crunch crunch = new Crunch();
        WingAttack wingAttack = new WingAttack();
        DragonClaw dragonClaw = new DragonClaw();

        super.setMove(rockPolish, crunch, wingAttack, dragonClaw);
    }
}
