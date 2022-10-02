package attacks;

import ru.ifmo.se.pokemon.*;

public class Spark extends PhysicalMove {
    public Spark() {
        super(Type.ELECTRIC,65,100);

    }
@Override
    protected  void applyOppDamage(Pokemon p,double d){
        p.setMod(Stat.HP, (int) (2.0*d));
        if(Math.random()<=0.3){
            Effect.paralyze(p);
        }

    }

}

