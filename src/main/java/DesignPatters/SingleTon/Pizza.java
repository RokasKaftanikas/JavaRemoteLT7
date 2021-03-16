package DesignPatters.SingleTon;

public class Pizza {

    private static String margarita = "Margarita";
    private static Pizza pizza;
    private int pizzaCounter = 0;

    private Pizza() {
        System.out.println("*****************");
    }

    public static Pizza getInstance(){
        if(pizza == null){
            pizza = new Pizza();
        }
        return pizza;
    }

    public void CookPizza(){
        pizzaCounter++;
    }

    public int getPizzaCounter(){
        return pizzaCounter;
    }

//    public void printPizzaName(){
//        System.out.println("Margarita");
//    }

    public static void main(String[] args){
        Pizza myPizza1 = Pizza.getInstance();
        Pizza myPizza2 = Pizza.getInstance();
       // myPizza1.printPizzaName();

        myPizza1.CookPizza();
        myPizza2.CookPizza();
        myPizza1.CookPizza();

        System.out.println(myPizza1);
        System.out.println(myPizza2);

        System.out.println(myPizza1.getPizzaCounter());
        System.out.println(myPizza2.getPizzaCounter());
    }

}
