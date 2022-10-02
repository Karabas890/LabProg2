package pokemons;

import attacks.Flatter;
import attacks.FocusEnergy;
import attacks.PoisonSting;
import attacks.RockTomb;
import ru.ifmo.se.pokemon.Type;

public class Nidoking extends Nidorino{
    public Nidoking(String name, int level) {
        super(name, level);
        setStats(81, 92, 77,85, 75, 85);
        setType(Type.POISON,Type.GROUND);

        setMove(new FocusEnergy(),new PoisonSting(), new Flatter(),new RockTomb());
    }
}
