import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Task.csv"), "utf-8");
        ArrayList<City> cities = new ArrayList();
        while (scan.hasNext()) {
            String line = scan.nextLine();
            String[] lineSplit = line.split(";");
            try {
                cities.add(new City(lineSplit[1], lineSplit[2], lineSplit[3], Integer.parseInt(lineSplit[4]), lineSplit[5]));
            } catch (ArrayIndexOutOfBoundsException e) {
                cities.add(new City(lineSplit[1], lineSplit[2], lineSplit[3], Integer.parseInt(lineSplit[4]), ""));
            }
        }
        for (City c:
             cities) {
            System.out.println(c.toString());
        }
    }
}
