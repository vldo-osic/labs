package pokemons;

import moves.Double_Team;
import moves.Facade;
import moves.Hydro_Pump;
import moves.Rest;
import ru.ifmo.se.pokemon.Type;

public class Grumpig extends Spoink{
    public Grumpig(String name, int level) {
        super(name, level);
        setStats(80, 45, 65, 90, 110, 80);
        setType(Type.PSYCHIC);
        setMove(new Facade(), new Rest(), new Double_Team(), new  Hydro_Pump());
    }
}
