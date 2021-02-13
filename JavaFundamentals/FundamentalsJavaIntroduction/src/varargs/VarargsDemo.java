package varargs;

//varargs tai toks parametras, kuris priima NELIMITUOTA
//KIEK apibrezto tipo argumentu (siuo atveju displayNumbers
//metoas priima nelimituota kieki int tipo argumentu)

public class VarargsDemo {
    public static void main(String[] args) {

        displayNumbers(5, 4, 5, 1, 2, 2);

    }
        //PASTaba: varargs, kaip ir array, suteikia galimybe pasiekti argumentus naudojant galimybe pasiekti
        // argumentus naudojant panasia sintakse (siu atveju: sk[i].
        // taip pat varargs, kaip ir array, suteikia galimybe
        //suzinoti kiek argumentu vartotjas padave metodui naudojant
        // lenght artibuta (sk.lenght
    public static void displayNumbers(int... sk){
        for (int i = 0; i < sk.length; i++){
            System.out.println(sk[i]);
        }

        //PASTABA: varargs gali buti tik paskutiniu metodo parametru
        //nekompiliuos:

    }




}
