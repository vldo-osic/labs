package utility;

import utility.Person;

import java.util.ArrayList;
import java.util.List;

public abstract class Scene {
    private ArrayList<Person> members = new ArrayList<>();
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Person> getMembers() {
        return this.members;
    }

    public void addMember(Person person) {
        members.add(person);
    }

    public void removeMember(Person person) {
        members.remove(person);
    }

    @Override
    public String toString() {
        return getName() + " " + name;
    }

}
