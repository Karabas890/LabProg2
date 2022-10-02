package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class RockTomb extends PhysicalMove {
    public RockTomb(){
        super(Type.DARK,60,95);
    }
    @Override
    public void applyOppDamage(Pokemon p,double d) {
        p.setMod(Stat.HP,(int)d*(2));
        p.setMod(Stat.SPEED,-1);
    }
}
