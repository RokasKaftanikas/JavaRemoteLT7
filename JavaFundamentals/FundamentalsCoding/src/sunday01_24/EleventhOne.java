package sunday01_24;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class EleventhOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String LongestText = "";

        if (text.isEmpty()){
            System.out.println("No text provided");
        }

        if (text.contains("Enough!")){
            String target = text.copyValueOf("Enough!".toCharArray());
            System.out.println(text.replace("Enough!",""));
        }
        String longest = Arrays.stream(text.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(longest);



        }


    }


