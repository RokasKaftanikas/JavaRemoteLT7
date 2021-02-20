package JavaFundamentals.FundamentalsJavaIntroduction.src.operators;

public class Number_operations {

    public static void main(String[] args) {

        //assigning numbers

        int a = 15;
        int b = 7;

        int result = 0;

        double c = 15;
        double d = 7;

        double result2 = 0;

        //################################

        //artimetiniai

        //addition
        result = a + b;
        System.out.println("a + b = " + result);
        System.out.println("25 + 30 = " + (25 + 30));

        //subtraction
        result = a - b;
        System.out.println("a - b = " + result);

        //multiplication
        result = a * b;
        System.out.println("a * b = " + result);

        //division
        result = a / b;
        System.out.println("a / b = " + result);

        //division with floating numbers
        result2 = c / d;
        System.out.println("c / d= " + result2);

        //division with floating and integrals
        result2 = a / d;
        System.out.println("atsakymas si karta " + result2);

        //modulus (gali buti naudojamas su neigiamomis reiksmemis as well)
        result2 = a % d;
        System.out.println("rezultatas yra " + result2);

        //###############################
        //compound operations

        int l = 5;
        l += 10;
        System.out.println("l += 10 rezultatas yra " + l);

        int k = 15;
        k -= -3;
        System.out.println("k -= -3 rezultatas yra " + k);

        k *= 3;
        System.out.println("k -= -3 rezultatas yra " + k);

        l /= 2;
        System.out.println("l /= 2 rezultatsa yra " + l);

        int p = 36;
        p %= 5;
        System.out.println("p %= 5 rezultatas yra " + p);

        //###################################

        //Increment operations

        //preincrement - keicia reiksme ir grazina

        int po = 2, dec = 2;

        System.out.println(++po + " yra naujas skaicius po");
        System.out.println("taciau jis nesikeicia, nes lieka " + po);

        System.out.println("--dec = " + --dec);
        System.out.println("dec reiksme po --dec yra " + dec);

        //post-increment- grazina reiksme ir ja pakeicia

        int i = 1;
        int j = 2, dec2 = 2;

        j = j +1;
        i++; //tas pats kas i = i + 1;
        System.out.println("i++ = " + i++);
        System.out.println("i reiksme padideje vienetu kai darom i++ ir dabar atsakymas " + i++);
        System.out.println("j = j + 1 yra " + j);

        System.out.println("dec2-- = " + dec2--);
        System.out.println("dec reiskme po dec2-- = " + dec2);

        //#################################################

        //relational operations

        int ziurim = 3,
                opa = 6;
        System.out.println("taigi, tai yra " + (ziurim == opa)); //equality operation

        int lol = 5,
                lul = 3;
        System.out.println("o dabar " + (lol != lul)); //inequality

        System.out.println("taigi, dabar kaip ir " + (lol > lul));
        System.out.println("hmmmmm " + (lul >= ziurim) + "?");

        System.out.println("nebestebina nes java meta " + (ziurim<=lol));
        System.out.println("dabar visgi " + (lol < lul));

        //###############################################
        //###############################################

        //loginiai operatoriai

        /*conjunction
        jei vien is reiksmiu lygi false, bendras atsakymas/rezultas bus lygus false
         abi reiksmes turi buti TRUE kad rezultatas butu TRUE*/


        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("bool1 && bool2 bus " + (bool1 && bool2));

        boolean bool3 = true;
        System.out.println("bool1 && bool3 bus " + (bool1 && bool3));

        //disjuntion/logical sum
        /*kad rezultatas butu true, turi buti bent viena true reiksme
         */

        System.out.println(bool1 || bool2);
        boolean bool4 = false;
        System.out.println(bool2 || bool4);
        System.out.println(bool1 || bool3);
        System.out.println(bool2 | bool3);

        System.out.println(false && true);
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);

        //negation !
        /* grazina priesinga logine reiksme
         */

        System.out.println(!(true || false));
        System.out.println(!(false || false));
        System.out.println(!true);
        System.out.println("!(true && true): " + !(true && true));



    }
}