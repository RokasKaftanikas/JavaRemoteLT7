package JavaFundamentals.Namu_darbai.src.second_HM;

public class EightOne {
    public static void main(String[] args) {
        int intVar1 = 10;
        int intVar2 = 12;
        short shortSum = (short) (intVar1 + intVar2);

        System.out.println(shortSum);
        shortSum++;
        System.out.println(shortSum);

        byte byteSum = (byte) ((byte) intVar1 + intVar2);
        System.out.println(byteSum);
        ++byteSum;
        System.out.println(byteSum);

    }
}
