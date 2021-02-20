package JavaFundamentals.FundamentalsCoding.src.sunday01_24;

import java.util.Scanner;

public class NinthOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int j = 0; j < 4; j++) {
            int x = j;
            boolean bool = true;
            for (int i = 0; i < a; i++) {
                if (j == 0) {
                    if (i == j || i == x) {
                        System.out.print("* ");
                        if (bool) {
                            x += 7;
                            bool = false;
                        } else {
                            x += 1;
                            bool = true;
                        }
                    } else {
                        System.out.print("_ ");
                    }
                }
                if (j == 1) {
                    if (i == j || i == x) {
                        System.out.print("* ");
                        if (bool) {
                            x += 5;
                            bool = false;
                        } else {
                            x += 3;
                            bool = true;
                        }
                    } else {
                        System.out.print("_ ");
                    }
                }
                if (j == 2) {
                    if (i == j || i == x) {
                        System.out.print("* ");
                        if (bool) {
                            x += 3;
                            bool = false;
                        } else {
                            x += 5;
                            bool = true;
                        }
                    } else {
                        System.out.print("_ ");
                    }
                }
                if (j == 3) {
                    if (i == j || i == x) {
                        System.out.print("* ");
                        if (bool) {
                            x += 1;
                            bool = false;
                        } else {
                            x += 7;
                            bool = true;
                        }
                    } else {
                        System.out.print("_ ");
                    }
                }
            }
            System.out.println();
        }
    }
}





