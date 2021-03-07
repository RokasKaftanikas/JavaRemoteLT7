package JavaAdvancedFeatures.homeworkof02_21.shapes;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius, String shapeDescription){
        super(shapeDescription);
        this.radius = radius;
    }

    @Override
    public String getArea() {
        return radius * Math.pow(Math.PI, 2) + " is the area of the " + shapeDescription;
    }

    @Override
    public String getLength() {
        return 2 * Math.PI * radius + " is a length " + shapeDescription;
    }
}
