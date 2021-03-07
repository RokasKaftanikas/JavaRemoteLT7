package JavaAdvancedFeatures.interfaces.example2;

public class MainFly {
    public static void main(String[] args) {
        Balloon balloon = new Balloon(50);
        System.out.println(balloon.calculateMaxSpeed());
        System.out.println(balloon.canFly("Bad"));

        Plane plane = new Plane(550);
        System.out.println(plane.calculateMaxSpeed());
        System.out.println(plane.canFly("bad"));

        AirTransport airTransport = new Balloon(1);
    }
}
