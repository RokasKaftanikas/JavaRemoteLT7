package DesignPatters.abstractfactory.example.factories;

import DesignPatters.abstractfactory.example.pizza.Margharita;
import DesignPatters.abstractfactory.example.pizza.Pizza;

public class MargharitaFactory implements PizzaAbstractFactory {


    @Override
    public Pizza create(int size) {
        return new Margharita(size);
    }
}
