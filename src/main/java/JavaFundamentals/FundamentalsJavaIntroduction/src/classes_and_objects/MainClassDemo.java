package JavaFundamentals.FundamentalsJavaIntroduction.src.classes_and_objects;

//importuota musu klase
//import ##########################;

//jei norime importuoti visas pakete esancias klases,
//po paketo reikia padedti taska ir zvaigzdute:
//import ciklai.*;

//importavimo pavyzdys, kuomet naudojamos daugiau nei viena klase is to paties paketo
import JavaFundamentals.FundamentalsJavaIntroduction.src.conditionstatements.IfConditionsSt;

public class MainClassDemo {
    public static void main(String[] args) {
        //reference kintamojo deklaracija (tokia pati kaip ir primityvaus)
        Dog dog1;
        //reference (nuorodos) kintamojo inicializacija
        dog1 = new Dog(); //JVM (Java Virtual Machine) heap'e (duomenu struksta esanti JVM'e) sukuria vian Dog

        //nuorodo keitimas yra tarsi distancinis pultas, kurio mygtukus spausdant liepiant telikui
        //tam tikrus veiksmus ar pamatyt tam tikra info
        //PASTABA: taip pasiekti kintamuosius nera taisyklinga, taip jis pasiekiamas tik demonstravimo tikslais:
        System.out.println(dog1.weight);

        dog1.height = 10;

        dog1.run();

        Dog dog2 = new Dog();
    }

}
