package array_types_n_stuff;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] arr = new int[4][];
        arr[0] = new int[3];
        arr[1] = new int[3];
        arr[2] = new int[]{56, 65, 79};
        arr[3] = new int[3];

        //visu reiksmiu spausdinimas
        for (int[] row: arr){
            for (int value: row){
                System.out.print(value + " "); //print kad nenukelti eiluciu
            }
            System.out.println();
        }
        System.out.println("#################################");

        //visu reiksmiu spausdinimas paprasto for ciklo pagalba
        for(int i = 0; i <arr.length; i++){
            for (int j = 0; j <arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWW");
        System.out.println(arr[1][0]);

        //neegzistuojancio elemento emimas (error: Java.lang.ArrayIndexOutOfBoundsException
        //System.out.println(arr[4][3]);

    }
}
