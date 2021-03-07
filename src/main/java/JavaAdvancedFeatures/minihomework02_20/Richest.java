package JavaAdvancedFeatures.minihomework02_20;

import java.util.ArrayList;
import java.util.List;

public class Richest {
    public static void main(String[] args) {
       Country country = new Country("Portugal", 56215);
       Country country1 = new Country("Spain", 51542);

       Person person = new Person("Tomas", 1020);
       Person person1 = new Person("Algis", 1021);

       double maxMoney = 0;
       List<Country> findACountry = new ArrayList<>();
       findACountry.add(country);
       findACountry.add(country1);
       for(Country nameCountry : findACountry){
           if(nameCountry.getFindRichest() > 0){
               maxMoney = nameCountry.getFindRichest();
           }
       }
       System.out.println(maxMoney);

        double maxAmount = 0;
        List<Person> findAPerson = new ArrayList<>();
        findAPerson.add(person);
        findAPerson.add(person1);
        for(Person namePerson : findAPerson){
            if(namePerson.getFindRichest() > 0){
                maxAmount = namePerson.getFindRichest();
            }
        }
        System.out.println(maxAmount);
    }
}
