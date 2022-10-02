package pokemons;

import attacks.Spark;
import attacks.Stomp;
import attacks.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Blitzle extends Pokemon {
    public Blitzle(String name,int level){
        super(name, level);
        setStats(45, 60, 32, 50,32, 76);
        setType(Type.ELECTRIC);
        setMove(new Spark(),new ThunderWave(),new Stomp());

    }
}
