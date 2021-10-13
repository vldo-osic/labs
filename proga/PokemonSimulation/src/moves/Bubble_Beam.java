package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Bubble_Beam extends SpecialMove {
    public Bubble_Beam() {
        super(Type.WATER, 65, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) {
            p.setMod(Stat.SPEED, -1);
        }
    }

    @Override
    protected String describe() {
        return "использует Пузырьковый луч";
    }

}
