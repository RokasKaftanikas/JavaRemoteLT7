package JavaAdvancedFeatures.namuDarbai.Trecioji;

import JavaAdvancedFeatures.namuDarbai.Antroji.Dog;

public class Main {
    public static void main(String[] args) {
        Car[] carArray;
        carArray = new Car[3];
        carArray[0] = new Car("BMW", 6, 1990, 5000, "touring");
        carArray[1] = new Car("Audi", 4, 1996, 5600.60, "sedan");
        carArray[2] = new Car("Mercedes", 6, 2000, 5300, "touring");

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
}
