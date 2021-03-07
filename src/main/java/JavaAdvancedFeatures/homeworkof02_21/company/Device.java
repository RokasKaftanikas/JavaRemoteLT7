package JavaAdvancedFeatures.homeworkof02_21.company;

public class Device{
    //Device turi talpinti (`name`, `price`, `quantity`, `description`);


    private String name;
    private double price;
    private int quantity;
    private String description;


    public Device(String name, double price, int quantity, String description) {
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    public double getQuantity() {
        return quantity;
    }
    public String getDescription() {
        return description;
    }
}

