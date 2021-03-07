package JavaAdvancedFeatures.concurrency.example3;

import JavaAdvancedFeatures.concurrency.example2.StopWatch;

public class ConcurrencyExample3 {
    public static void main(String[] args) {
        System.out.println("Main thread starts!");

        StopWatchOfExample3 sw1 = new StopWatchOfExample3("SW1");
        StopWatchOfExample3 sw2 = new StopWatchOfExample3("SW2");

        sw1.start();
        
        try {
            Thread.sleep(1000);
            sw2.start();

            System.out.println("Main thread is still running");

            Thread.sleep(3000);
            System.out.println("Main thread ends :/");

        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted on sleep.");
        }

    }
}
