package core.scenes;

import core.persons.Babushka;
import utility.Scene;

public class Village extends Scene {
    public Village(String name) {
        this.setName(name);
        Babushka babushka = new Babushka("Бабка");
        System.out.println(babushka.getName() + " живет в " + this.getName());
    }

}
