package JavaFundamentals.FundamentalsJavaIntroduction.src.accessModifiersDemo;

public class Car {

    //access modifier'iai nusako objekto kintamojo arba metodo prieinamumo lygmeni

    /*Private access modifier'iai nurodo, jog kintamasis arba metodas
    yra pasiekiamas tik toje klaseje, kur yra aprasytas
     */
    private String brand;
    private void turnOnEngine(){
        //a lot of code

    }
    void drive(){
        System.out.println(brand);
        turnOnEngine();
    }

    //###############################
    /*public access modifier nurodo, jog kintamasis

     */
    public String spalva;
    public void pypsek(){
        //pypsejimo logika
    }
    //################################
    /*kuomet access modifier'ius nera nurodytas (igauna default
    access modifier), tas kintamasis ar metodas
    be nurodyto access modifier'iaus gali buti pasiektas klasese
    esanciose tik tame paciame pakete, (siuo atveju, drive() metodas yra pasiekimas
     tik accessModifierDemo pakete
     */

    /*
    Pastaba: jei metodas naudojamas tik klases viduje, jis turetu buti private
     */

    private void SconfigurationOfSound() {
        //logika
    }

}
