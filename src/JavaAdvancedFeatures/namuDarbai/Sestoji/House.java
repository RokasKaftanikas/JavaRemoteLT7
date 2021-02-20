package JavaAdvancedFeatures.namuDarbai.Sestoji;

public class House {
    //Susikurti objektą `House`, su laukais: `houseArea`, `district`, `builtYear`, `condition`

    double houseArea;
    String district;
    int builtYear;
    String condition;

    public House(double houseArea, String district, int builtYear, String condition){
        this.builtYear = builtYear;
        this.condition = condition;
        this.district = district;
        this.houseArea = houseArea;
    }

    public double getHouseArea() {
        return houseArea;
    }

    public int getBuiltYear() {
        return builtYear;
    }

    public String getCondition() {
        return condition;
    }

    public String getDistrict() {
        return district;
    }
}
