package otherSolutions;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a = 1;
        for (int i = 0; a <= n; i++, a *= 2){
            System.out.println(a);
        }
    }
}
