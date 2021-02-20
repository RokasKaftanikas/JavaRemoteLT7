package JavaFundamentals.FundamentalsJavaIntroduction.src.conversion;

public class ConversionStuff {
    public static void main(String[] args) {

        //conversion

        int i = 25;
        float j = i;
        double p = i;
        System.out.println(j);

        //narrowing

        byte varByte = 10;
        short varShort = 10;
        char varChar = 10;

        //widening is automatic
        varShort = varByte;
        i = varShort;

        long varLong = 10;
        float varFloat = varLong;
        System.out.println(varLong);

        /*pastaba, galimas duomenu praradimas:
        int -> float
        long -> float
        long -> double
         */

        int varInt = 2147483647;
        float varFloat1 = varInt;
        System.out.println(varFloat1);
        System.out.println(varInt == varFloat1);

        //#########################

        /*automatic conversion rules (Java does it itself:
        1. jei dvi reiksmes yra skitinu duomenu tipu, java automatiskai pakeis
        mazesnio didzio tipo reiksmes tipa i didesnio tipo reiksmes tipa
        t.y. vienas didesnis, kitas mazesnis- mazesnis bus konvertuojamas i didesni
         */
        int varInt1 = 10;
        long varLong2 = 10;

        System.out.println("Atsakymas bus long'o tipo (varInt konvertuojamas)"
                + (varInt1 + varLong2));

        /* 2. Jei viena reiksme yra sveikojo tipo, o kita slankiojo kablelio tipo,
        tai sveikoji reiksme bus konvertuojama i slankiojo kablelio tipo reiksme
         */
        int varInt2 = 10;
        float varFloat2 = 10.0f;

        System.out.println("atsakymas yra float'o tipo (varInt2 konvertuojamas) "
                + (varInt2 + varFloat2));

        /* 3. byte, short ir char reiksmes naudojamos
         aritmetineje operacijoje automatiskai konvertuojamos i int
         (net jei nei vienas is operandu nera int)
         */
        byte varByte1 = 10;
        byte varByte2 = 10;
        short varShort1 = 10;

        System.out.println("operacijos metu varByte1 ir varByte2 konvertuojami " +
                " i int tipa: " + (varByte1 + varByte2));

        /* 4. kuomet visi automatiniai konvertavimai ivyko ir visi operandai
        tapo vienodo tipo - rezultatas bus butent to tipo
         */
        byte varByte3 = 10;
        byte varByte4 = 10;
        byte varByte5 = 10;

        System.out.println("rezultatas yra int tipo " + (varByte3+varByte4+varByte5));

        //#########################################
        //pavyzdys, kuriam naudojamos visos 4 taisykles

        short x = 14;
        float y = 13;
        double z = 30;

        //koks tipas?
        System.out.println(x*y/z);

        //##########################################################
    }
}