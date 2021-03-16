package DesignPatters.abstractfactory;

import DesignPatters.abstractfactory.example.factories.PizzaFactory;
import DesignPatters.abstractfactory.example.pizza.Pizza;

public class TestWIthPizzaFactory {
    public static void main(String[] args) {
        Pizza margharita = PizzaFactory.createPizza("Margharita", 32);
        Pizza capriciosa = PizzaFactory.createPizza("Capriciosa", 42);
        //Pizza fruttiDiMare = PizzaFactory.createPizza("Frutti di Mare", 32);
        System.out.println(margharita);
        System.out.println(capriciosa);
        //System.out.println(fruttiDiMare);
    }
}
