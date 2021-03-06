package JavaAdvancedFeatures.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAntMapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Michael", "Bob");

        // Isspausdinti vardus, kurie prasideda raide B
        /*
        for (int i = 0; i < names.size(); i++){
            if (names.get(i).startsWith("B")){
                System.out.println(names.get(i));
            }
        }
         */

        names.stream()
                .filter(name -> name.startsWith("B"))
                .forEach(name -> System.out.println(name));

        //paversti vardu sarasa i ju simboliu skaiciu

        //ctrl+shift+? to comment the text immediately
       /* List<Integer> namesLenghts = new ArrayList<>();
        for (int i = 0; i < names.size(); i++){
            namesLenghts.add(names.get(i).length());
        }*/

        List<Integer> namesLenghts = names.stream()
                .map(name -> name.length())
                .filter(lenght -> lenght > 5)
                .map(number -> number *10)
                .collect(Collectors.toList());

        System.out.println(namesLenghts);
    }
}
