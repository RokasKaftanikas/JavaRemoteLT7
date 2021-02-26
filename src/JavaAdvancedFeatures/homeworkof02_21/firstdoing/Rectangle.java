package JavaAdvancedFeatures.homeworkof02_21.firstdoing;

public class Rectangle extends RightAngleRectangle {

    public Rectangle(String shapeDescription, double width, double height) {
        super(shapeDescription, width, height);
    }

    public String getArea() {
        return (width * height) + " is the area of the " + shapeDescription;
    }
}

