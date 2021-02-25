package JavaAdvancedFeatures.namuDarbai.ketvirtoji;

public class Mobile {

    private String model;
    private String manufacturer;
    private double price;

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

    //Deimanto prirasymas
    public String toString(){
        return "Mobile{" +
                " model= " + model +
                " manufacturer= " + manufacturer +
                " price= " + price +
                "}";
            }

}
