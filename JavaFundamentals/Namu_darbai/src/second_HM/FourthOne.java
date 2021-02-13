package second_HM;

public class FourthOne {
    public static void main(String[] args) {
        //paprastesnis variantas
        int num2 = 133;
        int firstNumber = num2 / 100;
        int secondNumber = num2 % 100/ 10;
        int thirdNumber = num2 % 10;

        System.out.println(firstNumber + secondNumber + thirdNumber);

        //normalus variantas
        int num = 133;
        int sum = 0;

        while (num > 0) {
            sum = sum + num % 10;
            num = num  / 10;
        }

        System.out.println(sum);

        //internete rastas
        int num1 = 133;
        int sum1 = String.valueOf(num1)
                .chars()
                .map(Character::getNumericValue)
                .sum();

        System.out.println(sum1);
    }
}
