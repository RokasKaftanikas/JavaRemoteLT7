package JavaFundamentals.Namu_darbai.src.second_HM;

import java.util.Scanner;

public class NinthOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a%2 == 0) {
            System.out.println("okay, skaicius yra lyginis");
        } else {
            System.out.println("o ne, nera jis lyginis");
        }
    }
}
