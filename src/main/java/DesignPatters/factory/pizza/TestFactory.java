package DesignPatters.factory.pizza;

public class TestFactory {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();


        Pizza myPizza = pizzaFactory.getPizza(1);
        Pizza yourPizza = pizzaFactory.getPizza(2);

        System.out.println(myPizza.getDetectedPizza());
        System.out.println(yourPizza.getDetectedPizza());

    }
}
