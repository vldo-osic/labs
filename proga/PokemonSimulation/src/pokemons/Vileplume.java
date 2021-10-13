package pokemons;

import moves.Confide;
import moves.Dark_Pulse;
import moves.Rest;
import moves.Water_Gun;

public class Vileplume extends Gloom{
    public Vileplume(String name, int level) {
        super(name, level);
        setStats(75, 80, 85, 110, 90, 50);
        setType(super.getTypes());
        setMove(new Confide(), new Rest(), new Dark_Pulse(), new Water_Gun());
    }
}
