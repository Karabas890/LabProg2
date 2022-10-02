package attacks;


import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Overheat extends SpecialMove {
    public Overheat() {
        super(Type.FIRE,65,100);
    }
    @Override
    public void applyOppDamage(Pokemon p,double d){
        p.setMod(Stat.HP,(int)d*(2));
        p.setMod(Stat.SPECIAL_ATTACK,-2);
    }
}
