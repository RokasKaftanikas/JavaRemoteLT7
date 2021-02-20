package JavaFundamentals.FundamentalsJavaIntroduction.src.primitive_variables;

public class PrimitiveVariables {

    //bitas- maziausias duomenu matavimas matas
    // 8 bits = 1 byte

    public static void main(String[] args) {

        /*primiyviu duomenu tipai:
        integral numbers (int) - sveiki skaiciai
        */
        byte varByte;   // 8 bit
        short varShort; // 16 bit
        int varInt;     // 32 bit
        long varLong;   //64 bit

        //racionalieji/slankiojo kablelio skaiciai (floating point numbers)
        float varFloat;     //32 bit
        double varDouble;   //64 bit

        //characters (simboliai)
        char varChar;   // 16 bit

        //boolean (bulio)
        boolean varBoolean;

        //########################
        //########################
        //########################

        /*kai int- Java mato kaip sveika skaiciu
        long tipo toks pat kaip int (10) bus
        int tipo skaicius
         */
        int var = 10;
        long var2 = 10;

        /*kodas nesikompiliuos nes 13546447633 virsyja
        maksimalia int tipo reiksme
        long var3 = 13546447633;
         */

        //L raide rasoma po sveikojo skaiciaus informuoja Java
        // kad parasytas skaicius yra long tipo:
        long var3 = 13546447633L;

        //##############################################
        //##############################################
        //##############################################

        /*Java neleidzia didesnio tipo reiksmes priskirti
        mazesnio tipo kintamajam su isimtim.
        todel kodas nebus kompiliuojamas:
        int var5 = 10L*/

        //isimtys taisyklei:
        //compiler converts int to byte, short, char;
        byte var6 = 10;
        short var7 = 10;
        char var8 = 10;

        //####################################
        //####################################

        /*kai naudoji slankiojo kablelio skaiciu (floating point number)
        java mato ji kaip double tipo skaiciu (nekompiliuoja)- float var9 = 2.5;
        f raide parasyta prie slankiojo kalbelio skaiciu informuoja, kad
        parasytas skaicius - float tipo
        */
        float var9 = 2.5f;
        double var10 = 12.612154654; //galima rasyt d bet nera butina

        //####################################
        //####################################

        //boolean saugo logine verte: true or false

        //####################################
        //####################################

        //char tipo kintamajam galima but priskirtas simbolis;
        char var11 = '_';
        char var12 = 'a';

        //char tipo kintamajam galima priskirta desimtaine simbolio reprezentacija
        char var13 = 2216;

        //char tipo kintamajam gali buti priskirtas Unicode reiksme:
        char var14 = '\u00B6';

        System.out.println(var14);

        //################################
        //################################


    }
}
