package attacks;

import ru.ifmo.se.pokemon.*;

public class Stomp extends PhysicalMove {
    public Stomp(){
        super(Type.NORMAL,65,100);
    }
    @Override
    public void applyOppDamage(Pokemon p,double d){
        p.setMod(Stat.HP,(int)d*(2));
        if(Math.random()<=0.3){
            Effect.flinch(p);
        }
    }
}
