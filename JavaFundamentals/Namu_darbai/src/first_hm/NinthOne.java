package first_hm;

import java.util.Scanner;

public class NinthOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int Vidurkis = 0;

        Vidurkis = (a+b+c)/3;
        System.out.println("vidurkis butu " + Vidurkis);
    }
}
