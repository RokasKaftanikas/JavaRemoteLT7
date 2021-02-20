package JavaAdvancedFeatures.polymorphism;

public class ACRemote implements RemoteController{

    @Override
    public void enable(boolean action) {
        System.out.println("Turning Air conditioning ON");
    }
}
