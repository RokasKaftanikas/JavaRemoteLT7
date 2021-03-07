package JavaFundamentals.FundamentalsCoding.src.saturday01_23;

import java.util.Scanner;

public class ThirdOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        double delta = Math.pow(b, 2) - (4*a*c); // b*b - 4*a*c


        if (delta < 0) {
            System.out.println("Delta negative");
        } else if (delta == 0){
            double x = (-b / 2 * a);
            double ats = a * Math.pow(x, 2) + b * x + c;
            System.out.println(ats);
        } else {
            double x1, x2;
            x1 = (-b - Math.sqrt(delta))/2*a;
            x2 = (-b + Math.sqrt(delta))/2*a;
            System.out.println("The roots are " + x1 + " and " + x2);

            double ats1, ats2;
            ats1 = (a * Math.pow(x1, 2)) + (b * x1) + c;
            System.out.println(ats1);
            ats2 = (a * Math.pow(x2, 2)) + (b * x2) + c;
            System.out.println(ats2);
        }
    }
}
