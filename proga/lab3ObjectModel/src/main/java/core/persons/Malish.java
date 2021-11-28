package core.persons;

import core.scenes.MalishBirthday;
import utility.Movable;
import utility.Person;
import utility.Scene;
import utility.WaitBirthday;

public class Malish extends Person implements Movable, WaitBirthday {
    private int age = 7;

    public Malish(String name) {
        this.setName(name);
        System.out.println(this.toString());
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void moveIn(Scene scene) {

        try {
            this.getSceneNow().removeMember(this);
        } catch (NullPointerException e) {
        }

        this.setSceneNow(scene);
        scene.addMember(this);
        System.out.println(this.getName() + " отправляется в " + scene.getName());
    }

    public void prepareToMoveIn(Scene scene) {
        System.out.println(this.getName() + " собирается отправиться в " + scene.getName());
    }

    public void waitBirthday(Malish birthdayMan) {
        MalishBirthday BD = new MalishBirthday(this, "Наступающий День Рождения");
        System.out.println(this.getName() + ": исполняется " + (this.getAge() + 1) + " лет");
        System.out.println(this.getName() + ": долго ждет " + BD.getName());
    }

    public static class Heart {

        private boolean isBroken = false;

        public void setIsBroken(boolean b) {
            isBroken = b;
            if (b) System.out.println("Сердце: *разрывается*");
        }

    }

}
