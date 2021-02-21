package JavaAdvancedFeatures.generics.generic_interface;

public class Motorcycle implements Comparable<Motorcycle>{

    private int maxSpeed;

    @Override
    public int compareTo(Motorcycle object) {
        return 0;
    }

    @Override
    public Motorcycle getObject() {
        return this;
    }
}
