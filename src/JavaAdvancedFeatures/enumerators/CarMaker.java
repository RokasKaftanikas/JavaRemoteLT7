package JavaAdvancedFeatures.enumerators;

public enum CarMaker {
    BMW("Bymer", 1850),
    VOLVO("Volvo", 2020),
    MB("Mercedes-Benz", 1920);

    final String fullName;
    final int establishedOn;

    CarMaker(String fullName, int establishedOn){
        this.establishedOn = establishedOn;
        this.fullName = fullName;
    }
}
