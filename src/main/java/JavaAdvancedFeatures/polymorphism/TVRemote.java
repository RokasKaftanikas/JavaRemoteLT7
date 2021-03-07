package JavaAdvancedFeatures.polymorphism;

public class TVRemote implements RemoteController{


    @Override
    public void enable(boolean action) {
        if (action){
            System.out.println("Turning on the Tele");
        } else {
            System.out.println("oh no, anyway");
        }
    }
}
