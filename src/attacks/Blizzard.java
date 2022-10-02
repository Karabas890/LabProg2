package attacks;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {
    public Blizzard(){
        super(Type.ICE,110,70);
    }
    @Override
    public void applyOppDamage(Pokemon target,double d) {
        target.setMod(Stat.HP,(int)d*(2));

    }
    @Override
    public void applyOppEffects(Pokemon target) {
        if(Math.random()<=0.1){
            target.setMod(Stat.SPEED,-10);
        }
    }


}
