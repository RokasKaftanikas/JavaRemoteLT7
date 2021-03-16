package DesignPatters.bridge;

public class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Musu apskritimas yra ";
    }
}
