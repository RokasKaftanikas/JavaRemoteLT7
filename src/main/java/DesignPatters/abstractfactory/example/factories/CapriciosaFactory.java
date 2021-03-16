package DesignPatters.abstractfactory.example.factories;

import DesignPatters.abstractfactory.example.pizza.Capriciosa;
import DesignPatters.abstractfactory.example.pizza.Pizza;

public class CapriciosaFactory implements PizzaAbstractFactory {

    @Override
    public Pizza create(int size) {
        return new Capriciosa(size);
    }
}
