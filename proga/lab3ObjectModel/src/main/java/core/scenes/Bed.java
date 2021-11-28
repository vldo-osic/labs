package core.scenes;

import core.persons.Malish;
import utility.Scene;

public class Bed extends Scene {

    public Bed(Malish malish) {
        setName("кровать");
        malish.moveIn(this);
        cryInBed(malish);
    }

    public void cryInBed(Malish malish) {
        System.out.println(malish.getName() + " горько плачет, лежа в кровати(");
        Malish.Heart heart = new Malish.Heart();
        heart.setIsBroken(true);
    }
}
