package JavaAdvancedFeatures.concurrency.example4;

public class Bench {

    private int availableSeats;

    public Bench(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void takeASeat(){
        if (availableSeats > 0){
            System.out.println("Take a seat out");
            availableSeats--;
            System.out.println("Available places to sit: " + availableSeats);
        } else {
            System.out.println("All seats are taken");
        }
    }

    public synchronized void takeASeatSync(){
        if (availableSeats > 0){
            System.out.println("Take a seat out");
            availableSeats--;
            System.out.println("Available places to sit: " + availableSeats);
        } else {
            System.out.println("All seats are taken");
        }
    }

    public void takeASeatSyncBlock(){
        System.out.println("Unsynched part!");

        synchronized (this) {
            if (availableSeats > 0) {
                System.out.println("Take a seat out");
                availableSeats--;
                System.out.println("Available places to sit: " + availableSeats);
            } else {
                System.out.println("All seats are taken");
            }
        }
    }
}
