package JavaFundamentals.FundamentalsJavaIntroduction.src.classes_and_objects;

import JavaFundamentals.FundamentalsJavaIntroduction.src.accessModifiersDemo.Car;

public class ProperDog {

    // PASTABA: procesas, kurio metu paverčiame objekto kintamuosius privačiais ir sukuriam
    // jiems getter'ius ir setter'ius vadinamas inkapsuliacija (tai yra vienas iš pagrindinių
    // 4-ių fundamentalių objektinio programavimo konceptų)

    private int height = 12;
    private int weight = 5;
    private String veisle = "Auksinis retriveris";

    ProperDog() {

    }

    ProperDog(int height, int weight, String veisle) {
        // this raktažodis yra nuorodą į esamą objektą
        this.height = height;
        this.weight = weight;
        this.veisle = veisle;
    }

    // methods (behaviour) / metodai:

    void run() {
        System.out.println("Šuo bėga");
    }

    void atneskKamuoliuka(String kamuoliukas) {
        System.out.println("Šuo atneša kamuoliuką " + kamuoliukas);
    }

    //##########################################
    //getters and setter (accessors) sukurimas
    //##########################################
    // Sukuriame setter'ius, kad galėtume priskirti reikšmę:

    //PASTABA: kuomet kuriame setter'io pavadinimas, pirmasis pavadinimo
    //zodis yra set, sekantis objekto kintamojo pavadimas is didziosios raides

    // PASTABA: setterių egzistavimo prasmė yra, kad galima būtų įterpti logiką, neleidžiančią
    // priskirti nelogiškų ar netaisyklingų reikšmių. Su laiku tai tapo kodo tvarkos taisykle,
    // kurios reikia VISADA paisyti (net jei ir neketinate rašyti papildomos logikos neleidžiančios
    // įvesti visų reikšmių)
    void setHeight(int height) {
        if (height > 0 ) {
            this.height = height;
        } else {
            System.out.println("Ūgis negali būti minusinis!!!!");
        }
    }

    void setWeight(int weight) {
        this.weight = weight;
    }
    void setVeisle(String veisle) {
        this.veisle = veisle;
    }

    // Sukuriame getter'ius, kad galėtumėme gauti objekto kintamųjų reikšmes

    int getHeight() {
        return this.height;
    }

    int getWeight() {
        return this.weight;
    }

    String getVeisle() {
        return this.veisle;

    }

    //#######################

    Car car = new Car();
    //leidzia padaryti, nes default

}