import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {

        Battle b = new Battle();
        Pokemon p1 = new Palkia("Уолтер Уайт", 1);
        Pokemon p2 = new Blitzle("Джесси Пинкмен", 1);
        Pokemon p3 = new Zebstrika("Густаво Фринг", 1);
        Pokemon p4 = new NidoranM("Сол Гудман", 1);
        Pokemon p5 = new Nidorino("Хэнк Шредер", 1);
        Pokemon p6 = new Nidoking("Майк Эрмантраут", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p4);
        b.addFoe(p3);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
