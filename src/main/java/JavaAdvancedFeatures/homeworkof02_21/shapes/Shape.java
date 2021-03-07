package JavaAdvancedFeatures.homeworkof02_21.shapes;

public abstract class Shape {
    /*
    Susikurti abstrakčią klasę `Shape` ir jį paveldėti:
    * `Shape` klasė privalo turėti lauką: `shapeDescription`;
    * Susikurti objektą `Circle` su lauku `radius`;
    * Susikurti objektą `RightAngleRectangle` su laukais `width`, `height`;
    * Susikurti objektą `Rectangle` ir paveldėti objektą RightAngleRectangle;
    * Inicializuoti sukurtus `Circle`, `RightAngleRectangle` ir `Rectangle` objektus;
    * Apskaičiuoti apskritimo plotą ir ilgį;
    * Apskaičiuoti stataus trikampio plotą - ```(a*b)/2``` ir stačiakampio plotą;
    * Gautus rezultatus įrašyti į failą naudojantis BufferedWriter objekta.
     */

    protected String shapeDescription;

    public Shape(String shapeDescription){
        this.shapeDescription = shapeDescription;
    }

    public abstract String getArea();

    public abstract String getLength();

}
