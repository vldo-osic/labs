package pokemons;

import moves.Double_Team;
import moves.Facade;
import moves.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Spoink extends Pokemon {
    public Spoink(String name, int level) {
        super(name, level);
        setStats(60, 25, 35, 70, 80, 60);
        setType(Type.PSYCHIC);
        setMove(new Facade(), new Rest(), new Double_Team());
    }
}
