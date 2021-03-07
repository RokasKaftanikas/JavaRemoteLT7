package JavaFundamentals.FundamentalsJavaIntroduction.src.array_types_n_stuff;

public class ArrayStartOff {
    public static void main(String[] args) {

        //defaultines (numatytosios) reiksmes:
        //sveikuju kintamuju: 0
        //nesveikuju kintamuju: 0.0
        //simboliu char: tuscia vieta (\u0000)
        //objektai (string): null
        //boolean: false

        //int array declaration
        //if there are no array declares, elements will have default
        int[] arr = new int[10];

        System.out.println(arr[0]);
        System.out.println(arr[1]);

        //int array declaration and initialization (starts from zero: 0 == 1no, 1 == 2no)
        int [] arr2 = new int[] {
                10, 223, 312, 4, 5254
        };

        System.out.println(arr2[1]);

        System.out.println(arr2[3]); //trying to access an array that does not exist, will give an error


        //iteracija per masyva

        System.out.println("\nArr2 masyvo turinys:");

        for (int p = 0;  p < arr2.length; p++){
            System.out.println(arr2[p]);
        }
    }
}
