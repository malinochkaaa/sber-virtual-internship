package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<City> CityList = new ArrayList<>();
        Scanner sc = new Scanner(new File("/Users/alinaakimova/Sber.csv"));
        String splitBy = ";";
        while (sc.hasNext())
        {
            String line = sc.nextLine();
            String[] cities = line.split(splitBy);
            if(cities.length < 6){
                CityList.add(new City(cities[1], cities[2], cities[3], "", Integer.parseInt(cities[4])));
            }else{
                CityList.add(new City(cities[1], cities[2], cities[3], cities[5], Integer.parseInt(cities[4])));
            }
        }

        Comparator<City> comparator1 = Comparator.comparing(o -> o.name);

        Comparator<City> comparator2 = Comparator.comparing(o -> o.district);
        comparator2 = comparator2.thenComparing(o -> o.name);

        CityList.sort(comparator1);
        System.out.println("First sorted list:");
        for (City c:
                CityList) {
            System.out.println(c.toString());
        }

        System.out.println("Second sorted list:");
        CityList.sort(comparator2);
        for (City c:
                CityList) {
            System.out.println(c.toString());
        }
        sc.close();
    }
}
