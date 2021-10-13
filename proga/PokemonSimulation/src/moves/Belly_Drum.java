package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Belly_Drum extends StatusMove {
    public Belly_Drum() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, (int) (0.5 * p.getHP()));
        p.setMod(Stat.ATTACK, 6);
    }

    @Override
    protected String describe() {
        return "Барабанит в брюхо";
    }

}
