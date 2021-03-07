package JavaFundamentals.FundamentalsJavaIntroduction.src.conversion;

public class ManualConversion {
    public static void main(String[] args) {

        //casting- reiksmes duomenu tipo keitimas i kita duomenu tipa 'ranku' pagalba
        //is didesnio i mazesni (apeinama Automatic narrowing conversion taisykle, neegzistuoja su byte, short, char)
        long varLong = 10;
        int varInt = (int) varLong;

        //is slankiojo kablelio vertejes duomenu tipo i sveikai
        //pati Java tuo nepasirupina
        double p = 32.2614;
        float num1 = 3.64523f;
        int m = (int) p;
        int o = (int) num1;
        System.out.println(m + "\n" + o);

        //#################################################

        /*sudetingesni atvejai
        verte virsyja galima maksimalia duomenu tipo verte:
        (kadangi sveikas skaicius automatiskai yra int tipo, negalima
        rasyti vertes virsijancios maksimalia galima int verte
         */
        long varLong2 = 2147483648L;

        /*atkreipti demesi reikia, kad castinama reiksme
        tilptu reziuose, kuriam ji yra priskiriama*/
        short varShort = (short) 2147483;
        System.out.println(varShort);





    }
}
