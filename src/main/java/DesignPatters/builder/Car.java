package DesignPatters.builder;

public class Car {

    private String color;
    private boolean hasTurboCompressor;
    private int wheelsCount;

    // create private contstrutor
    // create inner builder class
    // create methods with...
    // create build method which return Car

    private Car(String color, boolean hasTurboCompressor, int wheelsCount) {
        this.color = color;
        this.hasTurboCompressor = hasTurboCompressor;
        this.wheelsCount = wheelsCount;
    }

    public String getColor() {
        return color;
    }

    public boolean isHasTurboCompressor() {
        return hasTurboCompressor;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public static class CarBuilder{

        private String color;
        private boolean hasTurboCompressor;
        private int wheelsCount;

        public CarBuilder(int wheelsCount){
            this.wheelsCount = wheelsCount;
        }

        public CarBuilder withColor(String color){
            this.color = color;
            return this;
        }

        public CarBuilder withModifications (boolean hasTurboCompressor){
            this.hasTurboCompressor = hasTurboCompressor;
            return this;
        }

        public Car build(){
            return new Car(color, hasTurboCompressor, wheelsCount);
        }
    }
}
