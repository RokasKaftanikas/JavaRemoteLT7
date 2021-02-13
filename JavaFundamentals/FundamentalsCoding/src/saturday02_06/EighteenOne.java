package saturday02_06;

import java.util.Scanner;

public class EighteenOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String sneezeRegex = "(?i)acho{1,}!"; // (?i) - ignore case
        if (word.matches(sneezeRegex)) {
            System.out.println("Į sveikatą!");
        }
    }
}
