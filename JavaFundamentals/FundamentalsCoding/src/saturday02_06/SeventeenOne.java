package saturday02_06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class SeventeenOne {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String date = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate date1 = LocalDate.parse(date, formatter);
        LocalDate date2 = LocalDate.now();

        long elapsedDays = ChronoUnit.DAYS.between(date2, date1);
        System.out.println(elapsedDays);

    }
}
