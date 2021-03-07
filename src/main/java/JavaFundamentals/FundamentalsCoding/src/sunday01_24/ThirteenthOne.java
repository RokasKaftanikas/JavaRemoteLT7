package JavaFundamentals.FundamentalsCoding.src.sunday01_24;

import java.util.Scanner;

public class ThirteenthOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine() + " ";
        char[] chars = text.toCharArray();
        String word = " ";
        String newText = "";

        for (int i = 0; i < chars.length; i++){
            if(chars[i] != ' '){
                word += chars[i];
            } else {
                newText += word + " " + word + " ";
                word = " ";
            }
        }

        System.out.println(newText);

        }
    }

