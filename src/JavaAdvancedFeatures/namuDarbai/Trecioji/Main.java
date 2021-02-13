package JavaAdvancedFeatures.namuDarbai.Trecioji;

import JavaAdvancedFeatures.namuDarbai.Antroji.Dog;

public class Main {
    public static void main(String[] args) {
        Car[] carArray;
        carArray = new Car[3];
        carArray[0] = new Car("BMW", "V8", 1990, 5000, "touring");
        carArray[1] = new Car("Audi", "I6", 1996, 5600.60, "sedan");
        carArray[2] = new Car("Mercedes", "V6", 2000, 5300, "touring");

        System.out.println(newestModel(carArray));
        System.out.println(AveragePrice(carArray));
        System.out.println(CheckIfTypeIsSedan(carArray));
        System.out.println(BiggestPrice(carArray));

    }

    public static String newestModel(Car[] carArray) {
        String newestModel = null;
        int theYear = 0;
        for (int i = 0; i < carArray.length; i++) {
            if (carArray[i].getYear() > theYear) {
                theYear = carArray[i].getYear();
                newestModel = carArray[i].getModel();
            }
        }
        return newestModel;
    }

    private static String AveragePrice(Car[] carArray) {
        double sum = 0;
        for (int j = 0; j < carArray.length; j++) {
            sum = sum + carArray[j].getPrice();
        }
        return "Average price: " + sum / carArray.length;
    }

    public static String CheckIfTypeIsSedan(Car[] carArray){
        String typeOftheModel = null;
        for (int k = 0; k < carArray.length; k++){
            if (carArray[k].getType().matches("sedan")){
                typeOftheModel = carArray[k].getModel();
            }
        }
        return typeOftheModel;
    }

    public static String BiggestPrice(Car[] carArray) {
        String model = null;
        double thePrice = 0;
        for (int i = 0; i < carArray.length; i++) {
            if (carArray[i].getPrice() > thePrice) {
                thePrice = carArray[i].getPrice();
                model = carArray[i].getModel();
            }
        }
        return model;
    }
        /*
        Car car1 = new Car("BMW", "V8", 1990, 5000, "touring");
        Car car2 = new Car("Audi", "I6", 1996, 5600.60, "sedan");
        Car car3 = new Car("Mercedes", "V6", 2000, 5300, "touring");

        int metai1 = 2021 - car1.year;
        int metai2 = 2021 - car2.year;
        int metai3 = 2021 - car2.year;

        if (metai1 < metai2 && metai1 < metai3){
            System.out.println(car1.year);
        } else if (metai2 < metai1 && metai2 < metai3){
            System.out.println(car2.year);
        } else {
            System.out.println(car3.year);
        }

        double vidurkis = (car1.price + car2.price + car3.price) / 3;
        System.out.println(vidurkis + " euru");

        if (car1.type.matches("sedan")){
            System.out.println(car1.model);
        } else if (car2.type.matches("sedan")){
            System.out.println(car2.model);
        } else {
            System.out.println(car3.model);
        }

        if (car1.price > car2.price && car1.price > car3.price){
            System.out.println("brangiausia bus " + car1.model);
        } else if (car2.price > car1.price && car2.price > car3.price){
            System.out.println("brangiausia bus " + car2.price);
        } else {
            System.out.println("brangaisuai bus " + car3.price);
         */

}
