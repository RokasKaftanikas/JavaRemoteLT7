package JavaAdvancedFeatures.minihomework02_20;

public class Country implements FindRicher{
    /*
    Sukurti interfeisą, kuris turėtų metodą `findRicher`.
Implementuoti šį metodą turi 2 klasės: `Country` ir `Person`.
Abi klasės privalo turėti laukus: `name` ir `amount`
Sukurti po 2, kiekvienos klasės objektus.
Sąraše saugokite tiek, Person, tiek Country klasės objektus.
Iteruodami per objektų sąrašą naudokite `findRicher` metodą, kuris lygina dviejų
objektų `amount` reikšmes ir gražina didesnę.
     */

    private String name;
    private double amount;

    public Country(String name, double amount){
        this.name = name;
        this.amount = amount;
    }

    public double getFindRichest() {
        return amount;
    }
}