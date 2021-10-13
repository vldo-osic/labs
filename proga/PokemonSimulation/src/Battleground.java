import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Battleground {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon p1 = new Lapras("Валюха Титан", 3);
        Pokemon p2 = new Grumpig("Чекила", 2);
        Pokemon p3 = new Vileplume("Чак Норрис", 3);
        Pokemon p4 = new Spoink("Макгрегор", 1);
        Pokemon p5 = new Oddish("Петушок", 2);
        Pokemon p6 = new Gloom("Бодя Кулак", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
