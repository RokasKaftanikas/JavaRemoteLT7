package JavaFundamentals.FundamentalsJavaIntroduction.src.otherSolutionsForSDAHomework;

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int[] numbers = Arrays
                .stream(args)
                .mapToInt(Integer::parseInt)
                .toArray();


        for(int i = 1; i <= 10; i ++) {
            System.out.print(i + " - ");
            int numCount = 0;
            for (int j = 0; j < numbers.length; j++){
                if(numbers[j] == i){
                    numCount++;
                }
            }
            System.out.println(numCount);
        }
    }
}
