package JavaFundamentals.FundamentalsCoding.src.sunday01_24;

import java.util.Scanner;

public class NinthDominykoOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 0){
            return;
        }

        char [][] pattern = {
                {'*', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*', ' ', ' ', ' ', ' ', ' ', '*'},
                {' ', '*', ' ', ' ', ' ', ' ', '*', ' ', ' ', '*', ' ', ' ', ' ', '*', ' '},
                {' ', ' ', '*', ' ', ' ', '*', ' ', ' ', ' ', ' ', '*', ' ', '*', ' ', ' '},
                {' ', ' ', ' ', '*', '*', ' ' , ' ', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' '}
        };

        for (int i = 0; i < pattern.length; i++){
            for (int j = 0, k = 0; j < a; j++, k++){
                System.out.print(pattern[i][k]);
                if (pattern[i].length == k + 1){
                    k=-1;
                }
            }
            System.out.println();
        }
    }
}
