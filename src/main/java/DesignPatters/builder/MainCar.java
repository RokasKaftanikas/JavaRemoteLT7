package DesignPatters.builder;

public class MainCar {
    public static void main(String[] args) {
        Car.CarBuilder builder = new Car.CarBuilder(4).
                withColor("black").
                withModifications(true);

        Car withANewCar = builder.build();

        System.out.println(withANewCar);

        Car RimantoCar = new Car.CarBuilder(4).build();


    }
}
