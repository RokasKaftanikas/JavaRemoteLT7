package DesignPatters.decorator;

public class DecoratorUsage {
    public static void main(String[] args) {
        FragStatistics statistics = new FirstPersonShooterFragStatistics();

        int deathCount = statistics.incrementDeathCount(); // nothing appears on the screen
        statistics.incrementFragCount(); // nothing appears on the screen
        int fragCount = statistics.incrementFragCount(); // nothing appears on the screen

        System.out.println(deathCount);
        System.out.println(fragCount);


//        // use of decorators
//        FragStatistics decoratedStatistics = new FragDeathRatioDecorator(
//                                                new FragInfoDecorator(
//                                                        new DisplayCountersDecorator(
//                                                                new DeathCountInfoDecorator(statistics))));

        // tas pats, kas
        DeathCountInfoDecorator deathCountInfoDecorator = new DeathCountInfoDecorator(statistics);
        DisplayCountersDecorator displayCountersDecorator = new DisplayCountersDecorator(deathCountInfoDecorator);
        FragInfoDecorator fragInfoDecorator = new FragInfoDecorator(displayCountersDecorator);
        FragDeathRatioDecorator decoratedStatistics = new FragDeathRatioDecorator(fragInfoDecorator);

        decoratedStatistics.incrementFragCount();
        decoratedStatistics.incrementFragCount();
        decoratedStatistics.incrementFragCount(); // because we are good players!
        decoratedStatistics.incrementDeathCount();
    }
}
