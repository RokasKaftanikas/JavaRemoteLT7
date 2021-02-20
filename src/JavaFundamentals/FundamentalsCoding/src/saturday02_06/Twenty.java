package JavaFundamentals.FundamentalsCoding.src.saturday02_06;

import java.util.Random;
import java.util.Scanner;

public class Twenty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = new Random().nextInt(100);

        boolean guessed;

        do {
            System.out.println("Guess a number");
            int guessedNumber = sc.nextInt();
            guessed = evaluateIfNumberWasCorrect(guessedNumber, answer);
        } while (!guessed);
    }

    public static boolean evaluateIfNumberWasCorrect(int guessedNumber, int answer) {
        if (guessedNumber < answer) {
            System.out.println("not enough");
            return false;
        }
        if (guessedNumber > answer) {
            System.out.println("too much");
            return false;
        }
        System.out.println("Congratulations!");
        return true;
    }
}
