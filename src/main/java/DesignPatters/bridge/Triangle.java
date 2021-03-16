package DesignPatters.bridge;

public class Triangle extends Shape{


    public Triangle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Musu trikampis bus ";
    }
}
