package JavaAdvancedFeatures.homeworkof02_21.company;

import JavaAdvancedFeatures.homeworkof02_21.input_output_utils.Inputs_Outputs;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.FileWriter;

public class CompanyMain {
    public static void main(String[] args) {
        /*
        Susikurti 3 objektus: `Company`, `Device`, `ProductionType`:
        * Company turi talpinti laukus (`name`, `address`, `productionType`, `devices`);
        * Device turi talpinti (`name`, `price`, `quantity`, `description`);
        * ProductionType turi talpinti tipus -> (TECHNOLOGIES, AUTOMOBILES, GARDEN_TOOLS, FOOD);
         * Inicializuoti 5 `company` objektus. Vienas `company` objektas privalo turėti 2-3 `device` objektus;
         * Atvaizduoti kiekvieno `company` objekto brangiausią `device` objektą;
         * Atvaizduoti visus `company` objektus, kurių `productType` -> TECHNOLOGIES;
         * Visa informacija išvedama į result.txt failą.
         */

        Device phones = new Device("Phones", 900, 10, "Device to call someone");
        Device tablets = new Device("Tablets", 1200, 15, "Device to use as POS");
        Device screwDrivers = new Device("ScrewDrivers", 10, 3, "Device to fix something");
        Device disposableBoxes = new Device("DisposableBoxes", 20, 100, "Device to put food into");
        Device computers = new Device("Computers", 1000, 2, "Device to operate business");

        List<Device> devices = new ArrayList<>();
        devices.add(phones);
        devices.add(tablets);
        devices.add(screwDrivers);
        devices.add(disposableBoxes);
        devices.add(computers);

        Company company1 = new Company("Tesonet", "Saltoniskiu g. 10", ProductionType.TECHNOLOGIES, Arrays.asList(phones, tablets, computers));
        Company company2 = new Company("Wix", "Gedimino g. 2", ProductionType.AUTOMOBILES, Arrays.asList(phones, computers));
        Company company3 = new Company("Bolt", "Konstitucijos pr.", ProductionType.FOOD, Arrays.asList(disposableBoxes, phones));
        Company company4 = new Company("Wolt", "Seskines g. 2", ProductionType.GARDEN_TOOLS, Arrays.asList(disposableBoxes, tablets, screwDrivers));
        Company company5 = new Company("Santechnikas is Ukmerges", "Gedimino g. 5", ProductionType.TECHNOLOGIES, Arrays.asList(computers, phones, tablets, disposableBoxes));

        List<Company> companies = new ArrayList<>();
        companies.add(company1);
        companies.add(company2);
        companies.add(company3);
        companies.add(company4);
        companies.add(company5);

        getMostExpensiveDevice(companies);
        getTechnologyCompanies(companies);
        findEachCompaniesMostExpensiveDevice(companies);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Inputs_Outputs.RESULTS_COMPANY_FILE_LOCATION))) {
            String thisText = getTechnologyCompanies(companies) +
                    "\n" + getMostExpensiveDevice(companies) +
                    "\n" + findEachCompaniesMostExpensiveDevice(companies);

            bufferedWriter.write(thisText);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public static String getMostExpensiveDevice(List<Company> companies) {
        StringBuilder mostExpensiveDeviceText = new StringBuilder();
        for (Company company : companies) {
            Device mostExpensiveDevice = new Device("test", 0, 1, "a");
            for (Device device : company.devices) {
                if (mostExpensiveDevice.getPrice() < device.getPrice()) {
                    mostExpensiveDevice = device;
                }
            }
            mostExpensiveDeviceText.append(company.name + " most expensive device is: " + mostExpensiveDevice.getName());
            mostExpensiveDeviceText.append("\n");
            System.out.println(company.name + " most expensive device is: " + mostExpensiveDevice.getName());
        }
        return String.valueOf(mostExpensiveDeviceText);
    }
    public static String getTechnologyCompanies(List<Company> companies) {
        StringBuilder technologyCompaniesText = new StringBuilder();
        technologyCompaniesText.append("Technology companies are: \n");
        for (Company company : companies) {
            if (company.getProductionType() == ProductionType.TECHNOLOGIES) {
                System.out.println(company.name);
                technologyCompaniesText.append(company.name);
                technologyCompaniesText.append("\n");
            }
        }
        return String.valueOf(technologyCompaniesText);
    }

    private static List<Device> findEachCompaniesMostExpensiveDevice(List<Company> companies) {
        List<Device> devices = new ArrayList<>();
        for (Company company : companies) {
            Device mostExpensiveDevice = company.getDevices().get(0);
            for (Device device : company.getDevices()) {
                if (mostExpensiveDevice.getPrice() < device.getPrice()) {
                    mostExpensiveDevice = device;
                }
            }
            devices.add(mostExpensiveDevice);
        }
        return devices;
    }
}
