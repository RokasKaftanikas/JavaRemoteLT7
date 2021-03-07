package JavaAdvancedFeatures.polymorphism;

public class MainRemote {

    public static void main(String[] args) {
        //polymorphism
        RemoteController remote = new TVRemote();
        remote.enable(true);
        System.out.println(remote.getClass().getSimpleName());

        remote = new ACRemote();
        System.out.println(remote.getClass().getSimpleName());

        TVRemote tvRemote= new TVRemote();
        ACRemote acRemote = new ACRemote();

        //printTVObject(ACRemote); taip negalima
        //printAcObject(TVRemote); taip irgi negalima

        printRemoteControllerObject(tvRemote);
        printRemoteControllerObject(acRemote);
        printRemoteControllerObject(remote);
    }

    //KISS - keep it simple stupid!!!

    private static void printRemoteControllerObject(RemoteController remote){
        System.out.println(remote.getClass().getSimpleName());
    }
}
