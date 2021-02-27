package JavaAdvancedFeatures.minihomework02_20;

public class Person implements FindRicher{

    private String name;
    private double amount;

    public Person(String name, double amount){
        this.name = name;
        this.amount = amount;
    }


    @Override
    public double getFindRichest() {
        return amount;
    }
}
