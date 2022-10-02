package pokemons;

import attacks.FocusEnergy;
import attacks.PoisonSting;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class NidoranM extends Pokemon {
    public NidoranM(String name,int level){
        super(name, level);
        setStats(46, 57, 40, 40,40, 50);
        setType(Type.POISON);
        setMove(new FocusEnergy(),new PoisonSting());
    }
}
