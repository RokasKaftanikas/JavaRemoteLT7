package primitive_variables;

public class variables {

    //kintamasis pasiekiamas visuose klases metoduose

    //kintamojo deklaravimas (tipo nurodymas+vardas(name/identifier) nurodymas)
    int kint;

    //obejkto kintamasis (instance variable/field)
    int var1 = 10;

    public void doSth() {
        //initialization
        kint = 10;

        //lokalus kintamasis
        int var2 = 12;

        //prints out the variable
        System.out.println(var2);

    }
    public void dosthElse() {
        /*lokalusis kintamasis pasiekiamas metode, kuriame deklaravome
        declaration*/
        int var3 = 20;

        //objekto kintamjam yra neprivaluma priskirti reiksme
        System.out.println(kint);

        //lokaliam kintamajam reiksmes priskirimas (inicializacija) yra butina
        System.out.println(var3);

    }
}
