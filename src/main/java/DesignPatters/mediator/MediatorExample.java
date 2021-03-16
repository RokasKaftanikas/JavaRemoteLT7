package DesignPatters.mediator;

public class MediatorExample {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Button button = new Button();
        button.setMediator(mediator);
        mediator.setButton(button);

        Fan fan = new Fan();
        fan.setMediator(mediator);
        mediator.setFan(fan);

        PowerSupplier powerSupplier = new PowerSupplier();
        mediator.setPowerSupplier(powerSupplier);

        button.press();
        fan.turnOff();


    }
}
