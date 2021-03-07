package JavaAdvancedFeatures.homeworkof02_21.polygon;

public class RegularPolygonMain {
    public static void main(String[] args) {
        Square square = new Square(6);
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5);

        System.out.println(square.getPerimeter() + " is the perimeter");
        System.out.println(square.getArea() + " is an area");
        System.out.println(square.getInteriorAngle());

        System.out.println(equilateralTriangle.getPerimeter() + " is the perimeter");
        System.out.println(equilateralTriangle.getArea() + " is an area");


    }
}
