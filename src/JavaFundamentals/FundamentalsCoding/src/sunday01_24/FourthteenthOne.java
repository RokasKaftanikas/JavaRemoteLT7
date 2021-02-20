package JavaFundamentals.FundamentalsCoding.src.sunday01_24;

import java.util.Scanner;

public class FourthteenthOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        int c1 = a;
        int c2 = b;

        System.out.println(c1);
        System.out.println(c2);

        if (c1 >= 'a' && c1 <= 'z' && c2 >= 'a' && c2 <= 'z'){
            int difference = c2 - c1 - 1; // - 1 due to reason that between a and b there is no difference
            System.out.println(difference);
        }



    }
}
