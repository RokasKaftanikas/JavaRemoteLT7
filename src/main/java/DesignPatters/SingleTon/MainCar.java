package DesignPatters.SingleTon;

public class MainCar {
    public static void main(String[] args) {
        Car car = Car.getInstance();

        System.out.println(car);
        car.getNameOfCar();
    }
}
