package saturday01_23;

import java.util.Scanner;

public class FifthOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a <= 0) {
            return;
        }

        System.out.println("Prime numbers: ");
        for (int num = 2; num <= a; num++) {
            if (isPrimeNumber(num)) {
                System.out.println(num);
            }
        }

    }
    public static boolean isPrimeNumber(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; // if number is divisible then its not a prime number
            }
        }
        return true; // if no divisible found then the number is prime number
    }
    /*
    int value =  scanner.nextInt();
    if (value <= 0) return;

    for (int i = 2; i < value; i++)
        boolean isPrime = true;
        for (int j = 2; j < i; j++)
            if (i % j == 0){
                isPrime == false;
                break;
                }
            }
    if (isPrime) {
    System.out.println(i);
    }
     */


}



