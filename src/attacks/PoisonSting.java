package attacks;

import ru.ifmo.se.pokemon.*;

public class PoisonSting extends PhysicalMove {
    public PoisonSting(){
        super(Type.POISON,15,100);
    }
    @Override
    public void applyOppDamage(Pokemon p,double d) {
        p.setMod(Stat.HP,(int)d*(1));
        if(Math.random()<=0.2){
            Effect.poison(p);
        }
    }

}
