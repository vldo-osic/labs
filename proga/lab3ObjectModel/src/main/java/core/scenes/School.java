package core.scenes;

import utility.Scene;
import utility.Season;

public class School extends Scene {
    private boolean isWorking;

    public void setIsWorking(Season season) {
        setName("Школа");
        isWorking = season != Season.SUMMER;
        viewIsWorking();
    }

    public void viewIsWorking() {
        System.out.println(isWorking ? "Школа работает" : "Занятия в школе закончились");
    }
}
