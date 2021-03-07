package JavaAdvancedFeatures.namuDarbai.Pirmoji;

import java.util.Locale;

public class FirstOne {
    public static void main(String[] args) {
        /*1. Susikurti String tipo kintamąjį su tekstu: "Ad Astra Per Aspera" (žemiau pateiktas užduotis atlikti naudojantis String funkcijas)
    * Paversti tekstą tik mažosiomis raidėmis;
    * Paversti tekstą tik didžiosiomis raidėmis;
    * Pakeisti visas 'A' raides, raidėmis 'X';
    * Patikrinkite ar jūsų tekstas prasideda tekstu: "Ad".*/

        String text = "Ad Astra Per Aspera";

        System.out.println(text.toLowerCase(Locale.ROOT));

        System.out.println(text.toUpperCase(Locale.ROOT));

        String replaced = text.replace('A', 'X');
        System.out.println(replaced);

        if (text.startsWith("Ad")){
            System.out.println("awesome");
        } else {
            System.out.println("oh well");
        }
    }
}
