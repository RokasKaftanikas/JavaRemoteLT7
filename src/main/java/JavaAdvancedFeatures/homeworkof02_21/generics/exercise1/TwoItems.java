package JavaAdvancedFeatures.homeworkof02_21.generics.exercise1;

public class TwoItems<T> {
    /*
    Sukurti klasę `TwoItems`, kuri viduje turi 2 kintamuosius (entry1 ir entry2) ir geterius jų reikšmėms gauti, bei toString() metodą.
    Sukurti 2 atskirus objektus, vieną su sveikais skaičiais, kitą, su teikstinio formato duomenimis ir panaudojus toString()
    funkciją į ekraną išvesti įvestus duomenis.
    ---
    Susikurti klasę, kuri turi vieną Generic statinį metodą, kurio pagalba
    yra gražinama paskutinė, į ją paduoto sąrašo reikšmė.
    Išmėginti tiek su String tipo, tiek su Integer tipo sąrašais.
     */

    private T entry1;
    private T entry2;

    public TwoItems (T entry1, T entry2){
        this.entry1 = entry1;
        this.entry2 = entry2;
    }

    public T getEntry1() {
        return entry1;
    }

    public T getEntry2() {
        return entry2;
    }

    @Override
    public String toString() {
        return "TwoItems{" +
                "entry1=" + entry1 +
                ", entry2=" + entry2 +
                '}';
    }
}
