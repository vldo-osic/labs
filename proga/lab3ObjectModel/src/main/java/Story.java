import core.persons.Carlson;
import core.persons.Malish;
import core.scenes.Bed;
import core.scenes.MalishBirthday;
import core.scenes.Village;
import utility.Heading;
import utility.Season;

public class Story implements Heading {

    @Override
    public void whatHappenNext() {
        System.out.println("____________Чтоже было дальше...____________\n");

        Malish malish = new Malish("МалышБудущего");
        Carlson carlson = new Carlson("КарлсонБудущего");
        MalishBirthday bd = new MalishBirthday(malish);

        carlson.moveIn(bd);
        bd.celebrate();

        System.out.println("____________Конец спойлерам____________\n");

    }

    public static void main(String[] args) throws Throwable {
        Story story = new Story();

        Season SEASON = Season.SPRING;
        System.out.println(SEASON.toString());

        Malish malish;
        Bed bed = new Bed(malish = new Malish("Малыш"));
        story.whatHappenNext();

        SEASON = Season.SUMMER;
        System.out.println(SEASON.toString());

        Village village = new Village("Большое Буньково");
        malish.prepareToMoveIn(village);
        malish.waitBirthday(malish);

    }

}
