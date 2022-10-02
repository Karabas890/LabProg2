package pokemons;

import attacks.Flatter;
import attacks.FocusEnergy;
import attacks.PoisonSting;
import ru.ifmo.se.pokemon.Type;

public class Nidorino extends NidoranM{
    public Nidorino (String name, int level) {
        super(name, level);
        setStats(61, 72, 57,55, 55, 65);
        setType(Type.POISON);
        setMove(new FocusEnergy(),new PoisonSting(), new Flatter());

    }
}
