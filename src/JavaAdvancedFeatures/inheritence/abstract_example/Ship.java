package JavaAdvancedFeatures.inheritence.abstract_example;

public class Ship extends Vehicle {


    public Ship(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public int vehicleMaxSpeed() {
        return maxSpeed + 10;
    }
}
