package org.example;

public class City {
    String name, region, district, foundation;
    int population;

    public City(String name, String region, String district, String foundation, int population) {
        this.name = name;
        this.district = district;
        this.population = population;
        this.region = region;
        this.foundation = foundation;
    }

    @Override
    public String toString() {
        return "City{name='" + name + "', region='" + region + "', district='"
                + district + "', population=" + population + ", foundation=" + foundation + "}";
    }
}
