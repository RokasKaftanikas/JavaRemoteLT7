package JavaAdvancedFeatures.interfaces.example1;

public class InterfacesMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,3);
        System.out.println(rectangle.getArea());
        rectangle.printShape();

        Square square = new Square(5);
        System.out.println(square.getPerimeter());
        square.printShape();
    }
}
