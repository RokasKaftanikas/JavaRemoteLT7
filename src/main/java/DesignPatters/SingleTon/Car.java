package DesignPatters.SingleTon;

public class Car {
    private static String name = "BMW";
    private static Car car;

    private Car() {
    }

    public static Car getInstance(){
        if(car == null){
            car = new Car();
        }
        return car;
    }

    public void getNameOfCar(){
        System.out.println("Toyota");
    }
}
