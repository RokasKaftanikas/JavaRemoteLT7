package JavaFundamentals.FundamentalsJavaIntroduction.src.conditionstatements;

import netscape.javascript.JSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfConditionsSt {
    public static void main(String[] args) {

        //salyginis sakinys suteikia galimybe

        //if statemaent

        boolean deglasDega = true;
        if (deglasDega) {
            System.out.println("Ruosiames gintis");
        }

        //####################################################

        Scanner scanner = new Scanner(System.in);
        boolean deglasDeg = scanner.nextBoolean();

        if (deglasDeg) {
            System.out.println("Ruosiames gintis");
        } else {
            System.out.println("enjoy the night");
        }

        //if else

        boolean deglasDega2 = false;
        if (deglasDega2) {
            System.out.println("Ruosiames gintis");
        } else {
            System.out.println("O ne, viskas gerai");
        }

        // if su else if
        /*jei loterijos metu jusu kamuolio verte yra 8, jus gaunate tusinuka,
        jei 5- trintuka*/

        int kamuoliukoVerte = 54;

        if (kamuoliukoVerte == 8) {
            System.out.println("Gausi tusinuka");
        } else if (kamuoliukoVerte == 5) {
            System.out.println("Gausi trinktuka");
        } else {
            System.out.println("negausi nieko");
        }

        System.out.println("##########################################");

        /*jei Petriukas ismes siuksles ir isplaus indus-
        leis zaist su kompiuteriu   */

        boolean siukslesIsmestos = true;
        boolean indaiIsplauti = true;

        if (siukslesIsmestos && indaiIsplauti) {
            System.out.println("geras berniukas, gausi kompiuteri");
        } else {
            System.out.println("negausi");
        }

        //jei jusu temperatura yra didesne arba lygi 36.6 ir mazesne nei 37- esi sveikas

        float temperature = 36.7f;

        if (temperature >= 37.0f) {
            System.out.println("eik arbatos isgert ir sveik");
        } else if (temperature >= 36.6f && temperature < 37.0f) {
            System.out.println("Tu esi sveikas, gali eit i lauka");
        } else {
            System.out.println("sugedo termometras turbut...");
        }
    }
}

