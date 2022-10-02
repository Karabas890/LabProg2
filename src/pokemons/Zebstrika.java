package pokemons;

import attacks.Overheat;
import attacks.Spark;
import attacks.Stomp;
import attacks.ThunderWave;
import ru.ifmo.se.pokemon.Type;

public class Zebstrika extends Blitzle{
    public Zebstrika(String name, int level){
        super(name,level);
        setStats(75, 100, 63, 80,63, 116);
        setType(Type.ELECTRIC);
        setMove(new Spark(),new ThunderWave(),new Stomp(),new Overheat());
    }
}
