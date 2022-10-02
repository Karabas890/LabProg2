package pokemons;

import attacks.AuraSphere;
import attacks.Blizzard;
import attacks.Slash;
import attacks.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Palkia extends Pokemon {
    public Palkia(String name,int level){
        super(name,level);
        setStats(90,120,100,150,120,100);
        setType(Type.DRAGON,Type.WATER);
        setMove(new Slash(),new Blizzard(), new AuraSphere(),new Swagger());
    }
}
