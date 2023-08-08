public class City {
    private int index;
    public int getIndex() {
        return index;
    }
    private String name;
    public String getName() {
        return name;
    }
    private String region;
    public String getRegion() {
        return region;
    }
    private String district;
    public String getDistrict() {
        return district;
    }
    private int population;
    public int getPopulation() {
        return population;
    }
    private String foundation;
    public String getFoundation() {
        return foundation;
    }

    public City(int index, String name, String region, String district, int population, String foundation) {
        this.index = index;
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    @Override
    public String toString() {
        return "City{name='" + name + "', region='" + region + "', district='" +
                district + "', population=" + population + ", foundation=" + foundation + "}";
    }
}
