package scanner;

import java.util.Scanner;

//suteikia proga zmogui ivesti duomenis konsoleje

public class ScannerClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int var1 = scanner.nextInt();
        double var2 = scanner.nextDouble();

        System.out.println("primas nr: " + var1);
        System.out.println("antras nr: " + var2);

    }
}
