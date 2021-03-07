package JavaAdvancedFeatures.homeworkof02_21.shapes;

public class RightAngleRectangle extends Shape {

    double width;
    double height;

    public RightAngleRectangle(String shapeDescription, double width, double height){
        super(shapeDescription);
        this.height = height;
        this.width = width;
    }

    @Override
    public String getArea() {
        return ((width * height)/2) + " is the area of the " + shapeDescription;
    }

    @Override
    public String getLength() {
        return null;
    }
}
