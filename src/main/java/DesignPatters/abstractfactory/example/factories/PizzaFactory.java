package DesignPatters.abstractfactory.example.factories;

import DesignPatters.abstractfactory.example.pizza.Pizza;
import DesignPatters.abstractfactory.exercise.factories.FruttiDiMareFactory;

public class PizzaFactory {

    public static Pizza createPizza(String type, int size) {
        Pizza pizza;
        switch (type) {
            case "Margharita":
                MargharitaFactory m = new MargharitaFactory();
                pizza = m.create(size);
                break;
            case "Capriciosa":
                pizza = new CapriciosaFactory().create(size);
                break;
            case "Frutti di Mare":
                pizza = new FruttiDiMareFactory().create(size);
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }

}
