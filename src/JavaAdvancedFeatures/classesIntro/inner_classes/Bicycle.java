package JavaAdvancedFeatures.classesIntro.inner_classes;

public class Bicycle {

    private int maxSpeed;

    public Bicycle(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    //InnerClass
    public class Wheel{

        public void damage(){
            maxSpeed *= 0.5;
        }
    }
}
