package utility;

public abstract class Person {
    private String name;
    private Scene sceneNow;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Scene getSceneNow() {
        return sceneNow;
    }

    public void setSceneNow(Scene sceneNow) {
        this.sceneNow = sceneNow;
    }

    @Override
    public String toString() {
        return getName() + " присоединяется к истории";
    }
}
