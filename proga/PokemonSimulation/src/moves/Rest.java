package moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, (int) -(p.getStat(Stat.HP) - p.getHP()));
        Effect e = new Effect().turns(2).condition(Status.SLEEP);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "Засыпает на 2 хода";
    }

}
