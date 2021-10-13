package pokemons;

import moves.Belly_Drum;
import moves.Bubble_Beam;
import moves.Facade;
import moves.Hydro_Pump;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Lapras extends Pokemon {

    public Lapras(String name, int level) {
        super(name, level);
        setStats(130, 85, 80, 85, 95, 60);
        setType(Type.WATER, Type.ICE);
        setMove(new Belly_Drum(), new Bubble_Beam(), new Hydro_Pump(), new Facade());
    }
}
