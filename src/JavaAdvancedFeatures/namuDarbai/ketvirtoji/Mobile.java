package JavaAdvancedFeatures.namuDarbai.ketvirtoji;

public class Mobile {

    String model;
    String manufacturer;
    double price;

    public Mobile(String model, String manufacturer, double price){
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
    }
     public String getModel(){
        return model;
     }

    public String getManufacturer(){
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }
}
