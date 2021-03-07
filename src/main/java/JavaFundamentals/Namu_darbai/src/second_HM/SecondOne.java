package JavaFundamentals.Namu_darbai.src.second_HM;

public class SecondOne {
    public static void main(String[] args) {
        int a = 5, b = 13;

        int temporary = a;
        a = b;
        b = temporary;

        System.out.println("a = " + a + "\n" + "b = " + b);
    }
}
