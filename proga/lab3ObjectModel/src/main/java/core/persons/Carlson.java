package core.persons;

import utility.Movable;
import utility.Person;
import utility.Scene;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Carlson extends Person implements Movable {

    public Carlson(String name) {
        this.setName(name);
        System.out.println(this.toString());
    }

    @Override
    public void moveIn(Scene scene) {

        try {
            this.getSceneNow().removeMember(this);
        } catch (NullPointerException e) {
        }

        this.setSceneNow(scene);
        scene.addMember(this);
        System.out.println(this.getName() + " прилетает на " + scene.getName());
    }

}
