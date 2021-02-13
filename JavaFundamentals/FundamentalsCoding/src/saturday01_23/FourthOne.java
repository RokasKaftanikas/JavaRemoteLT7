package saturday01_23;

import java.util.Scanner;

public class FourthOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int result1, result2;

        for (int i = 1; i <= a; i++) {
            result1 = i%3;
            result2 = i%7;
            if (result1 == 0 && result2 == 0) {
                System.out.println("Fizz buzz");
            } else if (result1 == 0) {
                System.out.println("Fizz");
            } else if (result2 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }
    }
}
