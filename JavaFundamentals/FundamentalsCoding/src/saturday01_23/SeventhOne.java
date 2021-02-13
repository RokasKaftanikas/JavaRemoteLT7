package saturday01_23;

import java.util.Scanner;

public class SeventhOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 0;
        int num2 = 1;
        int fibonacci;

        for(int loop = 1; loop <= n; loop++) {
            fibonacci = num + num2;
            num = num2;
            num2 = fibonacci;
        }
        System.out.println(num);
        }
    }

