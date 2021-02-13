package JavaAdvancedFeatures.classesIntro.nested_classes;

public class NestedMainExample {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(5);
        System.out.println(bicycle.getMaxSpeed());

        /* you can write the new Bicycle([int maxSpeed:5]);
        Bicycle bicycle = new Bicycle(Integer.parseInt(args[0]));
         */

        Bicycle.Mechanic mechanic = new Bicycle.Mechanic();
        mechanic.upgrade(bicycle);

        System.out.println(bicycle.getMaxSpeed());


    }
}
