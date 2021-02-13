package JavaAdvancedFeatures.namuDarbai.Trecioji;

public class Car {
    /*
    3. Susikurti objektą "Car", su laukais: "model", "engine", "year", "price", "type (sedan, touring, suv)"
    * Inicializuoti 3 "Car" objektus naudojantis ciklą;
    * Objektai turi būti saugomi masyve;
    * Sukurti metodą naujausiam automobiliui rasti ir išspausdinti automobilio metus;
    * Sukurti metodą vidutinei automobilio kainai rasti;
    * Sukurti metodą, kuris atspausdins automobilio modelį, kurio tipas = 'sedan';
    * Sukurti metodą brangiausiam automobiliui rasti.
     */

    String model;
    String engine;
    int year;
    double price;
    String type;

    public Car(String model, String engine, int year, double price, String type){
        this.model = model;
        this.engine = engine;
        this.year = year;
        this.price = price;
        this.type = type;
    }

    public String getModel(){
        return model;
    }
    public String getEngine(){
        return engine;
    }
    public int getYear() {
        return year;
    }
    public double getPrice(){
        return price;
    }

    public String getType() {
        return type;
    }
}
