package JavaAdvancedFeatures.concurrency.example3;

import JavaAdvancedFeatures.concurrency.example2.StopWatch;

public class StopWatchOfExample3 extends  Thread{

    private String threadName;

    public StopWatchOfExample3(String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println(threadName + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
