package JavaAdvancedFeatures.inheritence.abstract_example;

public class AbstractIngeritanceExample {
    public static void main(String[] args) {
        //Vehicle vehicle = new Vehicle();
        Car car1 = new Car("Volvo", 50);
        System.out.println(car1.vehicleMaxSpeed());

        Ship ship1 = new Ship(20);
        System.out.println(ship1.vehicleMaxSpeed());
    }
}

