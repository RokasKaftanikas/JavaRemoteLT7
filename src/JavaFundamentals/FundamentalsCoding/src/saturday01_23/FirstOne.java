package JavaFundamentals.FundamentalsCoding.src.saturday01_23;

import java.util.Scanner;

public class FirstOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float diameter = scanner.nextFloat();
        //pirmas kartas
        double PI = 3.14;

        double perimeter = diameter * PI;

        System.out.println(perimeter);

        //tesimas

        double perimenter1 = diameter * Math.PI;

        System.out.println(perimenter1);

    }
}
