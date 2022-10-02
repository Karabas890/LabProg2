package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Slash extends PhysicalMove {
    public Slash(){
        super(Type.NORMAL,70,100);


    }
    @Override
    public void applyOppDamage(Pokemon target,double d){
        target.setMod(Stat.HP,(int)d*(3));

    }
}
