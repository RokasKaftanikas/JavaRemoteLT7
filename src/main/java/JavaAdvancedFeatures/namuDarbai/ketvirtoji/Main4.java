package JavaAdvancedFeatures.namuDarbai.ketvirtoji;

public class Main4 {
    public static void main(String[] args) {
        /*
        4. Sukurti objektą `Mobile`, su laukais: `model`, `manufacturer`, `price`
    * Inicializuoti 3 `Mobile` objektus;
    * Atrasti brangiausią įrenginį ir atspausdinti jo modelį ir gamintoją.
         */
        Mobile[] mobileArray;
        mobileArray = new Mobile[3];
        mobileArray[0] = new Mobile("S21", "Samsung", 1000.00);
        mobileArray[1] = new Mobile("11", "iPhone", 1250.00);
        mobileArray[2] = new Mobile("40", "Huawei", 800.00);

        System.out.println(BiggestPrice(mobileArray));
    }

    public static String BiggestPrice(Mobile[] mobileArray) {
        String model = null;
        String manufacturer = null;
        double priceIS = 0;
        for (int i = 0; i < mobileArray.length; i++) {
            if (mobileArray[i].getPrice() > priceIS) {
                priceIS = mobileArray[i].getPrice();
                model = mobileArray[i].getModel();
                manufacturer = mobileArray[i].getManufacturer();
            }
        }
    return manufacturer + " " + model;
    }
}