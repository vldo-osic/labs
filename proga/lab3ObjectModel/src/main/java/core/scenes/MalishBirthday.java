package core.scenes;

import core.persons.Malish;
import utility.Person;
import utility.Scene;
import utility.WaitBirthday;

public class MalishBirthday extends Scene implements WaitBirthday {
    protected Malish birthdayMan;

    @Override
    public void waitBirthday(Malish birthdayMan) {
        System.out.println("У " + birthdayMan.getName() + " важное событие - " + this.getName());
    }

    public MalishBirthday(Malish birthdayMan, String name) {
        this.birthdayMan = birthdayMan;
        this.setName(name);
        waitBirthday(birthdayMan);
    }

    public MalishBirthday(Malish birthdayMan) {
        this.birthdayMan = birthdayMan;
        birthdayMan.setAge(birthdayMan.getAge() + 1);
        this.setName("День рождения");
        System.out.println("Сегодня " + this.getName());
        System.out.println(birthdayMan.getName() + " исполнилось " + this.birthdayMan.getAge() + " лет");
    }

    public void celebrate() {
        System.out.println("Праздник начался!!!");
        try {
            for (Person i : this.getMembers())
                System.out.println(i.getName() + ": \"с " + birthdayMan.getAge() + "чем-то летием, УРА!\"");
        } catch (NullPointerException e) {
            System.out.println("Никто не пришел на фан-встречу(((");
        }
    }

    public Malish getBirthdayMan() {
        return this.birthdayMan;
    }
}
