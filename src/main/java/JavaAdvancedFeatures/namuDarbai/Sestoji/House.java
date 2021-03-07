package JavaAdvancedFeatures.namuDarbai.Sestoji;

public class House {
    //Susikurti objektą `House`, su laukais: `houseArea`, `district`, `builtYear`, `condition`

    private double houseArea;
    private String district;
    private int builtYear;
    private String condition;

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

    public String toString() {
        return "House{" +
                "houseArea=" + houseArea +
                ", district='" + district + '\'' +
                ", builtYear=" + builtYear +
                ", condition='" + condition + '\'' +
                '}';
    }
}
