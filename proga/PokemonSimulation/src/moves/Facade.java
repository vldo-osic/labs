package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (p.getCondition() == Status.POISON || p.getCondition() == Status.BURN || p.getCondition() == Status.PARALYZE) {
            super.power = 140;
        }
    }

    @Override
    protected String describe() {
        return "использует Фасаду";
    }
}
