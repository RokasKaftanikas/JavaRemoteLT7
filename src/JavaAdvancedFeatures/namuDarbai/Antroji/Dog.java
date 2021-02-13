package JavaAdvancedFeatures.namuDarbai.Antroji;

public class Dog {
    /*
    2. Susikurti objektą "Dog", su laukais: "name", "age", "color"
    * Inicializuoti 3 "Dog" objektus;
    * Objektai turi būti saugojami masyve;
    * Sukurti metodą vyriausio šuns radimui ir jo vardo išspausdinimui;
    * Sukurti metodą šunų vidutiniam amžiui rasti.
     */

    private String name;
    private String color;
    private int age;

    public Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }

    public String getColor() {
        return color;
    }
}
