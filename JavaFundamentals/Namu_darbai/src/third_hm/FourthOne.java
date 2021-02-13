package third_hm;

import java.util.Scanner;

public class FourthOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int var1 = scanner.nextInt();
        int var2 = scanner.nextInt();
        int var3 = scanner.nextInt();
        int rezultatas =sudauginkSkaicius(var1, var2, var3);

        System.out.println(rezultatas);

    }
        static int sudauginkSkaicius(int var1, int var2, int var3){
            return var1 * var2 * var3;
    }


}
