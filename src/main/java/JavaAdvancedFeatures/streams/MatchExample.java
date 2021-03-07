package JavaAdvancedFeatures.streams;

import java.util.Arrays;
import java.util.List;

public class MatchExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Michael");

        //Ar yra bent vienas vardas, kurio ilgis yra > 3?
        /*
        boolean isThereANameWhichLenghIsGtThan3 = false;
        for (int i = 0; i < names.size(); i++){
            if (names.get(i).length() > 3){
                isThereANameWhichLenghIsGtThan3 = true;
                break;
            }
        }
        */
        boolean isThereANameWhichLenghIsGtThan3 = names.stream().anyMatch(name -> name.length() > 3);
        System.out.println("ar yra bent vienas vardas kurio ilgis yra > 3: " + isThereANameWhichLenghIsGtThan3);

        //Ar visu vardu ilgiai yra > 3
        /*
        boolean areAllNameLenghtGtThan3 = false;
        int counter = 0;
        for (int i = 0; i < names.size(); i++){
            if (names.get(i).length() > 3){
                counter++;
            }
        }
        if (counter == names.size()){
            areAllNameLenghtGtThan3 = true;
        }
         */
        boolean areAllNameLenghtGtThan3 = names.stream().allMatch(name -> name.length() > 3);
        System.out.println("Ar visi vardu ilgiai yra > 3: " + areAllNameLenghtGtThan3);
    }
}
