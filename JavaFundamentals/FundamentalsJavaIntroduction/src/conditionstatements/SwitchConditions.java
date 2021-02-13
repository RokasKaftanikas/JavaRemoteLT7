package conditionstatements;

public class SwitchConditions {

    public static void main(String[] args) {

        //loterijos pavyzdys

        int kamuoliukoVerte = 6;

        switch (kamuoliukoVerte){
            case 8:
                System.out.println("prizas: tusinukas");
            break;
            case 5:
                System.out.println("prizas: trintukas");
            break;
            default:
                System.out.println("o ne! nieko nelaimejai");
        }


        //pasidometi Wrapper klasemis (pvz.: Integer)

        /*switch tik su int ir Integer
        byte ir Byte
        short ir Short
        char ir Character
        String
        Enum reiksmes
         */

    }
}
