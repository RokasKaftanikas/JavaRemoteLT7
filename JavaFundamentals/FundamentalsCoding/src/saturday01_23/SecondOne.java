package saturday01_23;

import java.util.Scanner;

public class SecondOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float weight = scanner.nextFloat(); //KG
        int height = scanner.nextInt(); //CM

        float heightInM = (float) (height / 100.0);

        double BMI = weight / Math.pow(heightInM, 2); //weight / (heightInM * heightInM)

        System.out.println(BMI);

        if (BMI >= 18.5 && BMI <= 24.9){
            System.out.println("BMI optimal");
        } else {
            System.out.println("BMI not optimal");
        }
    }
}
