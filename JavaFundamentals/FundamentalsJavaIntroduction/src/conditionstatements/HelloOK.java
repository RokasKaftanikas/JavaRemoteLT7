package conditionstatements;

import java.util.Scanner;

public class HelloOK
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        float weight = scanner.nextFloat();
        if (height > 150 && weight <= 180.0f) {
            System.out.println("Fasten your seatbelt!");
        } else {
            System.out.println("I'm sorry you can't go!");
    }

    }
}
