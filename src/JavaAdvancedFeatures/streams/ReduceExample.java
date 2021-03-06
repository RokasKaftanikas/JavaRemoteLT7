package JavaAdvancedFeatures.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ReduceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Michael", "Bob");

        // "Tom : Brandon : Michael : Bob"

        // PVZ 5 > 10 ? System.out.println("Penki yra daugiau uz desimt") : System.out.println("Penki yra maziau uz desimti");

        String text = names.stream()
                .reduce("",
                        (currentValue, element) -> (currentValue.isEmpty() ? "" : currentValue +
                                " : ") + element);
        /*
        1-a iteracija: text = "", currentValue = "", element = "Tom"
        2-a iteracija: text = "", currentValue = "Tom", element = "Brandon",
        3-a iteracija: text = "", currentValue = "Tom : Brandon", element = "Michael",
        4-a iteracija: text = "", currentValue = "Tom : Brandon : Michael", element = "Bob";
         */

        int num = names.stream()
                .map(name -> name.length())
                .reduce(0,
                        (currentSum, number) -> (number > 3 ? 1 : 0) + currentSum
                        );

        System.out.println(text);
        System.out.println(num);

        /*
        Su esamu žodžių sąrašu atlikite užduotis:
        * Sujunkite žodžius į vieną naudodami `reduce` funkciją;
        * Naudodami pradinį žodžių sąrašą, paverskite juos didžiosiomis raidėmis su `map` funkcija ir vėl
        sujunkite į vieną žodį su `reduce`;
        * Naudodami pradinį žodžių sąrašą, sujunkite į vientisą tekstą, žodį atskyrę ženklu `,`
        (tekstas negali prasidėti ar baigtis nurodytu ženklu);
        * Atsifiltruoti zozdius
        * Naudodami pradinį žodžių sąrašą, išspausdinkite tuos, kurie turi raidę `o`.
        [Rytas, Lova, Durys, Automobilis, Katinas]
         */
        List<String> words = Arrays.asList("Rytas", "Lova", "Durys", "Automobilis", "Katinas");

        String concatinatedString = words.stream()
                .reduce("", (concatenatedText, word) -> concatenatedText + word);
        System.out.println(concatinatedString);


        String concatinatedStringInCapital = words.stream()
                .map(word -> word.toUpperCase())
                .reduce("", (concatenatedText, word) -> concatenatedText + word);
        System.out.println(concatinatedStringInCapital);

        String concatinatedStringNew = words.stream()
                .filter(word -> word.length() > 5)
                .reduce("",
                        (concatenatedAText, word) -> (concatenatedAText.isEmpty() ? "" : concatenatedAText + ", ") + word
                );
        System.out.println(concatinatedStringNew);

    }
}
