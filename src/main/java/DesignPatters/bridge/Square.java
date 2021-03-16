package DesignPatters.bridge;

public class Square extends Shape{

    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Musu kvadratas bus  ";
    }
}
