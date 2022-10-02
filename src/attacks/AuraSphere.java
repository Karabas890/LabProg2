package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class AuraSphere extends SpecialMove {
    public AuraSphere(){
        super(Type.FIGHTING,80,100);
    }
    @Override
    public void applyOppDamage(Pokemon target,double d) {
        if(!target.hasType(Type.FLYING) && (!target.hasType(Type.GROUND))){
            target.setMod(Stat.HP,(int)d*(3));
        }
    }

}
