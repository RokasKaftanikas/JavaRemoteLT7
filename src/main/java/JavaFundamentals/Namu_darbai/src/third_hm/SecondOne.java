package JavaFundamentals.Namu_darbai.src.third_hm;

import java.util.Scanner;

public class SecondOne {
    public static void main(String[] args) {
        int[] tab = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tab.length; i++){
            System.out.print("ivesk sveika skaiciu ");
            tab[i] = scanner.nextInt();
        }

        float sum = 0;
        for (int i = 0; i < tab.length; i++){
            sum += tab[i];
        }
        System.out.println("vidurkis: " + (sum / tab.length));

    }
}
