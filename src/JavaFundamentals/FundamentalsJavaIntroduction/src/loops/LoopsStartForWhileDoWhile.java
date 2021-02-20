package JavaFundamentals.FundamentalsJavaIntroduction.src.loops;

public class LoopsStartForWhileDoWhile {

    public static void main(String[] args) {

        //For loop
        // 1) Inicializuojamas kintamasis (šiuo atveju vykdomas: int i = 0)
        // 2) Vykdoma bulio išraiška (šiuo atveju: i < 3)
        // 3) Vykdomas for ciklo kūne/bloke esantis kodas (šiuo atveju: System.out.println("Blah");)
        // 4) Vykdomas atnaujinimo sakinys (update statement) (šiuo atveju: i++)


        for (int i = 0; i < 5; i++) {
            System.out.println("bruh");
        }

        int j = 1;
        while (j < 3) {
            System.out.println("lol");
            j++;
        }

        int o = 5;

        //do while ciklas yra ivykdomas bent viena karta
        do {
            System.out.println("graze");
        } while (o != 5);

        //break sakinys išveda iš ciklo bloko
        for (int a = 0; a < 8; a++) {
            System.out.println("ooooooooo");
            if (a == 3) {
                break;
            }
        }

        //continue
        for (int a = 0; a < 8; a++) {
            if (a == 3) {
                continue;
            }
            System.out.println(a);
        }
    }
}
