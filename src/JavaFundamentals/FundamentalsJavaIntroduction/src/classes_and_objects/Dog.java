package JavaFundamentals.FundamentalsJavaIntroduction.src.classes_and_objects;

public class Dog {
    //dog

    //instance variables
    int height = 90;
    int weight = 25;
    String veisle = "auksines retriveris";


    //pastaba: jei jus nesukuriate jokiu konstruktoriu
    //tai klaseje konstruktorius be parametru automatiskai
    //susigeneruoja (pasirupina pati java
    Dog(){ //konstruktorius

    }
        //jei sukuriate konstruktoriu su parametrais
    //automatiskai konstruktorius be parametru nesigeneruoja
    Dog(int height, int  weight, String veisle){
        this.height = height; //this raktazodis yra nuoroda i esama objekta
        this.weight = weight;
        this.veisle = veisle;
    }
    //method

    void run(){
        //logika..
        System.out.println("suo bega");

    }

    void atnestKamuoliuka(String kamuoliukas){
        //logika
        System.out.println("suo atnesa kamuoliuka");

    }
}
