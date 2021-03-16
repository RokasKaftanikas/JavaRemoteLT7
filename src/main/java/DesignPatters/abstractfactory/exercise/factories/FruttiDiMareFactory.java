package DesignPatters.abstractfactory.exercise.factories;

import DesignPatters.abstractfactory.example.factories.PizzaAbstractFactory;
import DesignPatters.abstractfactory.example.pizza.Pizza;

public class FruttiDiMareFactory implements PizzaAbstractFactory {
    @Override
    public Pizza create(int size) {
        return null;
    }
}
