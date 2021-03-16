package DesignPatters.abstractfactory.example.factories;

import DesignPatters.abstractfactory.example.pizza.Pizza;

public interface PizzaAbstractFactory {
    public Pizza create(int size);
}
