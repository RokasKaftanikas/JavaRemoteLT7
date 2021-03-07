package JavaAdvancedFeatures.homeworkof02_21.polygon;

public class Square implements RegularPolygon{

    private int length;

    public Square(int length){
        this.length = length;
    }

    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public double getSideLength() {
        return length;
    }

    @Override
    public double getPerimeter() {
        return (4*length);
    }

    @Override
    public int getInteriorAngle() {
        return ((getNumSides() - 2) * 180);
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }
}
