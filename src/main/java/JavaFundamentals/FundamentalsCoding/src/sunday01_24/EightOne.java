package JavaFundamentals.FundamentalsCoding.src.sunday01_24;

import java.util.Scanner;

public class EightOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        char b = sc.next().charAt(0);
        float c = sc.nextFloat();

       if (b == '/' && c == 0.0){
           System.out.println("Cannot calculate");
       } else if (b == '-'){
           System.out.println(a - c);
       } else if (b == '/' && a > c){
           System.out.println(a / c);
       } else if (b == '+'){
           System.out.println(a+c);
       } else if (b == '*'){
           System.out.println(a * c);
       } else {
           System.out.println("Invalid symbol");
       }
    }
}
