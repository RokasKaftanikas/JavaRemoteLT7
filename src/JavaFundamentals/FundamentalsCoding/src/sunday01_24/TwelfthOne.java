package JavaFundamentals.FundamentalsCoding.src.sunday01_24;

import java.util.Scanner;

public class TwelfthOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char [] charArray = text.toCharArray();

        int space = 0;

        int totalChars = text.length();
        for (int i = 0; i < text.length(); i++){
            if (Character.isSpaceChar(charArray[i])){
                space++;
            }
        }
        System.out.println("Spaces: " + space);
        System.out.println("Percentage of spaces: " + ((space*100/totalChars)) + "%");
    }
}
