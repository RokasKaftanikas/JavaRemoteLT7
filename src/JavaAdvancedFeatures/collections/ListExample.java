package JavaAdvancedFeatures.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> visitedCountries = new ArrayList<>();
        visitedCountries.add("Germany");
        visitedCountries.add("Italy");
        visitedCountries.add("France");
        visitedCountries.add("Spain");
        visitedCountries.add("Italy");

        System.out.println("Original list");
        for (String country : visitedCountries){
            System.out.println(country);
        }

        visitedCountries.remove("France");
        System.out.println("edited list");
        for (String country : visitedCountries){
            System.out.println(country);
        }

        System.out.println(visitedCountries.contains("Germany"));


    }
}
