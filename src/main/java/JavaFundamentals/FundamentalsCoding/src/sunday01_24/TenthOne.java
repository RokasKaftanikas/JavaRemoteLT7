package JavaFundamentals.FundamentalsCoding.src.sunday01_24;

import java.util.Scanner;

public class TenthOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;

        if (a <= 0){
            return;
        }

        while (a > 0) {
            sum = sum + a % 10;
            a = a  / 10;
        }

        System.out.println(sum);
    }
}
