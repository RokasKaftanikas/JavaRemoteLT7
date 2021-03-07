package JavaAdvancedFeatures.homeworkof02_21.company;

import java.util.List;

public class Company{
    /*
    Company and device:
    * Susikurti 3 objektus: `Company`, `Device`, `ProductionType`:
    * Company turi talpinti laukus (`name`, `address`, `productionType`, `devices`);
    * Device turi talpinti (`name`, `price`, `quantity`, `description`);
    * ProductionType turi talpinti tipus -> (TECHNOLOGIES, AUTOMOBILES, GARDEN_TOOLS, FOOD);
    * Inicializuoti 5 `company` objektus. Vienas `company` objektas privalo turėti 2-3 `device` objektus;
    * Atvaizduoti kiekvieno `company` objekto brangiausią `device` objektą;
    * Atvaizduoti visus `company` objektus, kurių `productType` -> TECHNOLOGIES;
    * Visa informacija išvedama į result.txt failą.
     */

    protected String name;
    protected String address;
    protected ProductionType productionType;
    protected List<Device> devices;

    public Company(String name, String address, ProductionType productionType, List<Device> devices){
        this.name = name;
        this.address = address;
        this.productionType = productionType;
        this.devices = devices;
    }

    public String getName() { return this.getClass().getSimpleName();}

    public String getAddress() { return address;}

    public ProductionType getProductionType() { return productionType;}

    public List<Device> getDevices() { return devices;}
}
