package JavaFundamentals.FundamentalsJavaIntroduction.src.accessModifiersDemo;

public class Pagrindine {
   public void doSth() {
       Car car = new Car();
       /*NELEIS PASIEKTI
       System.out.println(car.brand);
       car.turnOneEngine;
        */

       //#####################

       /*leidzia pasiekti, nes sis kintamasis ir metodas turi
       public access modifier
        */
       car.spalva= "zalia";
       car.pypsek();
    }
}
