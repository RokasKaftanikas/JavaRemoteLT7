package DesignPatters.bridge;

import JavaAdvancedFeatures.namuDarbai.Trecioji.Main;

public class BridgePatternDriver {

    public static void main(String[] args) {

        Shape square = new Square(new Red());
        System.out.println(square.draw());

        Shape triangle = new Triangle(new Blue());
        System.out.println(triangle.draw());

        Shape circle = new Circle(new Pink());
        System.out.println(circle.draw());


    }
}
