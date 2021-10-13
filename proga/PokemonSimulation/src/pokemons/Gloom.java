package pokemons;

import moves.Confide;
import moves.Dark_Pulse;
import moves.Rest;
import ru.ifmo.se.pokemon.Type;

public class Gloom extends Oddish{
    public Gloom(String name, int level) {
        super(name, level);
        setStats(60, 65, 70, 85, 75, 40);
        setType(Type.GRASS, Type.POISON);
        setMove(new Confide(), new Rest(), new Dark_Pulse());
    }
}
