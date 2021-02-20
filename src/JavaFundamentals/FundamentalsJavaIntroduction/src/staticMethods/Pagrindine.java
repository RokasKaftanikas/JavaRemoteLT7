package JavaFundamentals.FundamentalsJavaIntroduction.src.staticMethods;

public class Pagrindine {
    public static void main(String[] args) {

        //taip kviesti statiniu metodu kviesti mes neprivalome ir neturetume
        SomeClassUtils someClassUtils = new SomeClassUtils();
        SomeClassUtils.pasisveikink();

        //statinius, prieinamus (t.y. prieiti leidzianciu access modifier'iu) metodus/kintamuosius
        //galime pasiekti nekuriant jokiu objektu, uztenka parasyti klases varda ir taska
        //tuomet pasieksime metodus/kintamuosius

    }
}
