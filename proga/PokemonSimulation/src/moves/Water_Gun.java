package moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Water_Gun extends SpecialMove {
    public Water_Gun() {
        super(Type.WATER, 40, 100);
    }

    @Override
    protected String describe() {
        return "стреляет из Водной Пушки";
    }
}
