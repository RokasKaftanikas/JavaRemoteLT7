package JavaFundamentals.FundamentalsCoding.src.saturday01_23;

import java.util.Scanner;

public class SixthOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double h = 0.0;

        for (double i = 1; i <= a; i++){
            h = h + 1.0/i;
        }
        System.out.printf("%.4f",  h);
    }
}
