package JavaAdvancedFeatures.enumerators;

public class ExampleMain {
    public static void main(String[] args) {
        System.out.println(Coffee.AMERICANO.name());

        Coffee coffee = Coffee.valueOf("LATTE");
        System.out.println(coffee.name());

        System.out.println(CarMaker.BMW.fullName);
    }
}
