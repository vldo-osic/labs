package utility;

public enum Season {
    WINTER("Зима"),
    SPRING("Весна"),
    SUMMER("Лето"),
    AUTUMN("Осень");

    private String name;

    String getName() {
        return this.name;
    }

    Season(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return (this.getName().equals("Лето") ? "Наступило " : "Наступила ") + this.getName() + "\n";
    }

}
