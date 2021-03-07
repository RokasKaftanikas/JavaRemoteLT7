package JavaAdvancedFeatures.homeworkof02_21.polygon;

public class EquilateralTriangle implements RegularPolygon{

    private int length;

    public EquilateralTriangle(int length){
        this.length = length;
    }


    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public double getSideLength() {
        return length;
    }

    @Override
    public double getPerimeter() {
        return 3 * length;
    }

    @Override
    public int getInteriorAngle() {
        return ((length - 2) * 180);
    }

    @Override
    public double getArea() {
        return ((Math.pow(length, 2)* Math.sqrt(3)) / 4);
    }
}
