package by.shop.task4.entity;

import java.io.Serializable;

public class City implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String name;
    private final String country;
    private final int foundationYear;
    private final double populationMillions;

    public City(String name, String country, int foundationYear, double populationMillions) {
        this.name = name;
        this.country = country;
        this.foundationYear = foundationYear;
        this.populationMillions = populationMillions;
    }

    @Override
    public String toString() {
        return "Город: " + name + "\n" +
                "Страна: " + country + "\n" +
                "Год основания: " + foundationYear + " г.\n" +
                "Население: ~" + populationMillions + " млн человек";
    }
}
