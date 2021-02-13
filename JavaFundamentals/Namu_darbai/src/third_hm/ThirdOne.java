package third_hm;

public class ThirdOne {
    public static void main(String[] args) {
        int[][] tab = new int[5][6];
        for (int i = 0; i < tab.length; i++){
            tab[i][i] = i;
        }
        for (int i = 0; i < tab.length; i++){
            for (int j = 0; j <= i; j++)
                System.out.print(j);
        }
        System.out.println();
    }
}
