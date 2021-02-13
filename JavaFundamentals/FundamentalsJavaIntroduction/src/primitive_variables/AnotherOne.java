package primitive_variables;

public class AnotherOne {

    //! objekto kintamasis gali buti neinicializuotas(gali netureti reiksmes)

    //objekto kintamojo deklaravimas (is kintamojo tipo ir kintamojo pavaidnimo
    int abc;

    //objekto kintamojo deklaravimas bei inicializacija
    int abcz = 25;

    void DoSth() {
        //obejkto kintamojo initialization
        abc = 23;

        System.out.println(abc);

    }

    void DosthElse() {
        //objekto kintamasis, yra pasiekiamas visuose metoduose toje klaseje kurioje yra deklratuotas
        System.out.println(abc);

    }


}
