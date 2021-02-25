package JavaAdvancedFeatures.namuDarbai.Sestoji;

import JavaAdvancedFeatures.namuDarbai.Trecioji.Car;

public class Main6 {
    /*
    6.  Susikurti objektą `House`, su laukais: `houseArea`, `district`, `builtYear`, `condition`
    * Inicializuoti 3 `House` objektus;
    * Rasti ir atspausdinti naujausio namo objektą;
    * Rasti visus įrengtus namus - fitted;
    * Rasti ir atspausdinti mažiausią pagal plotą namo objektą.
    P.S. `condition` kintamasis gali turėti reikšmes: `fitted`, `partially`
`finished`, `not finished`
    P.S.S. visi inicializuoti House objektai turi būti laikomi masyve
     */
    public static void main(String[] args) {
        House[] houseArray;
        houseArray = new House[3];
        houseArray[0] = new House(100, "Antakalnis", 2003, "fitted");
        houseArray[1] = new House(50, "Seskine", 2009, "finished");
        houseArray[2] = new House(75, "Zveynas", 2006, "fitted");

        System.out.println(getNewestProject(houseArray));
        System.out.println(CheckIfHouseIsFitted(houseArray));
        System.out.println(SmallestArea(houseArray));

    }

    public static String getNewestProject(House[] houseArray) {
        String district = null;
        int getYear = 0;
        for (int i = 0; i < houseArray.length; i++) {
            if (houseArray[i].getBuiltYear() > getYear) {
                getYear = houseArray[i].getBuiltYear();
                district = houseArray[i].getDistrict();
            }
        }
        return "The newest project is in " + district;
    }

    public static String CheckIfHouseIsFitted(House[] houseArray) {
        int fittedHouses = 0;
        for (int k = 0; k < houseArray.length; k++) {
            if (houseArray[k].getCondition().equals("fitted")) {
                fittedHouses++;

            }
        }
        return "The house in " + fittedHouses + " is fitted";
    }

    public static String SmallestArea(House[] houseArray) {
        String district = null;
        double getSmallestArea = houseArray[0].getHouseArea();

        for (int j = 0; j < houseArray.length; j++) {
            if (houseArray[j].getHouseArea() < getSmallestArea) {
                getSmallestArea = houseArray[j].getHouseArea();
                district = houseArray[j].getDistrict();
            }
        }
        return "The smallest house is in " + district + " and the area is " + getSmallestArea + " m2";
    }
}
