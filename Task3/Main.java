import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Task.csv"), "utf-8");
        ArrayList<City> cities = new ArrayList();
        while (scan.hasNext()) {
            String line = scan.nextLine();
            String[] lineSplit = line.split(";");
            try {
                cities.add(new City(Integer.parseInt(lineSplit[0]), lineSplit[1], lineSplit[2], lineSplit[3], Integer.parseInt(lineSplit[4]), lineSplit[5]));
            } catch (ArrayIndexOutOfBoundsException e) {
                cities.add(new City(Integer.parseInt(lineSplit[0]), lineSplit[1], lineSplit[2], lineSplit[3], Integer.parseInt(lineSplit[4]), ""));
            }
        }
        for (City c:
             cities) {
            System.out.println(c.toString());
        }
        City[] citiesArray = cities.toArray(new City[cities.size()]);
        City cityMax = citiesArray[0];
        for (int i = 1; i < citiesArray.length; i++) {
            if (cityMax.getPopulation() < citiesArray[i].getPopulation())
                cityMax = citiesArray[i];
        }
        System.out.println("[" + (cityMax.getIndex() - 1) + "] = " + cityMax.getPopulation());
    }
}
