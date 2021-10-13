package moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Hydro_Pump extends SpecialMove {
    public Hydro_Pump() {
        super(Type.WATER, 110, 80);
    }

    @Override
    protected String describe() {
        return "бьет Водной струей";
    }
}
