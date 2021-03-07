package JavaFundamentals.Namu_darbai.src.second_HM;

import java.util.Scanner;

public class EleventhOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ask = scanner.nextInt();

        if (ask > 0) {
            System.out.println("numeris didesnis nei nulis");
        } else if (ask < 0) {
            System.out.println("numeris mazesnis nei nulis");
        } else {
            System.out.println("LYGU");
        }
    }
}
