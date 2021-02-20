package JavaFundamentals.FundamentalsJavaIntroduction.src.string;

import java.util.Locale;

public class StringClassCemo {
    public static void main(String[] args) {
        //String reference tipas turi isskirtini bruoza, jog gali
        // buti inivializuotas nenaudojant new raktozodzio
        //o tiesiog parasyt tekstine eilute:
        String str = "abc";

        //taciau galima inicializuoti kaip ir kitus reference duomenu tipus:
        String str2 = new String("abc2");

        System.out.println(str);

        str += "def";

        //nors is paziuros atrodo jog mes naudojame ta pati objekta
        //kuri sukureme parase "String str = "abc";" statementa
        // is tiesu ivykdzius "str += "def";" statementa
        //buvo sukurtas naujas objektas ir jo nuoroda buvo priskirta
        //tam paciam kintamajam. Tokio pobudzio klasuses, kurios neleidzia
        //ju keisti vadinamos immutable (nekeiciamos. String'as yra immutable
        System.out.println(str);

        //###############################

        //Kuomet yra naudojamos vienos String reiksmes, tuomet
        //heap'e yra sukuriamas tik vienas objekas, kuris yra patalpinamas
        //String pool'e  (duomenu struktura, kuriame laikomi pasikartojancios String reiksmes)
        //PVZ: (tiek a, tiek b kintamieji rodys i ta pati objekta)
        String a = "abcdefg";
        String b = "abcdefg";

        if (a == b) {
            System.out.println("awesome");
        }

        //tekstas vienodas, taciau String reiksmes susivienodins vykdant programa
        //todel i string pool'a nepaklius
        String c = "abcdefg";
        String d = "abcdefg ";

        d = d.trim();
        if (c == d) {
            System.out.println("awesome");
        }

        // Pastaba: niekada nenaudoti '==' su Stringais, nebent isimtinis atvejais arba mokymosi tikslais

        //kuomet tikrinama ar sutampa teksto eilutes String objektuose, naudojamas equals metodas
        if (c.equals(d)) {
            System.out.println("awesome");
        } else {
            System.out.println("oho");
        }

        //#####################

        //concatentation

        String text1 = "labas ";
        String text2 = "rytas";

        System.out.println(text1.concat(text2));

        // String lenght
        System.out.println(text1.length());

        //String to upper and lower cases
        System.out.println(text1.toUpperCase());
        System.out.println(text2.toLowerCase());

        //###############################

        /*
         * e - floating point number in exponential notation
         * f - floating-point number
         * x - integer in hexadecimal system
         * o - integer in the octal number system
         * s - string
         * c - one character (char)
         * b - logical value
         */

    }
}
