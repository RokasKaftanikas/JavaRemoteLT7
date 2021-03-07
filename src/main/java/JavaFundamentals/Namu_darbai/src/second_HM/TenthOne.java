package JavaFundamentals.Namu_darbai.src.second_HM;

import java.util.Scanner;

public class TenthOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ala = in.nextInt();

        if (ala%2 != 0) {
            System.out.println("pakeiciau programa teisingai");
        } else {
            System.out.println("okay doki, lyginis");
        }
    }
}
