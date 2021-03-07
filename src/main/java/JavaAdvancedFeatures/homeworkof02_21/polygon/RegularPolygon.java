package JavaAdvancedFeatures.homeworkof02_21.polygon;

public interface RegularPolygon {
    /*
    Daugiakampiai:
    * Interfeisas `RegularPolygon` turi 2 metodus `getNumSides` ir `getSideLength`
    * Klasė `EquilateralTriangle`, kuri implementuoja interfeisą `RegularPolygon` metodą
    `getNumSides` gražina skaičių 3, metodą `getSideLength` gražina kintamojo reikšmę,
    inicializuotą per konstruktorių;
    * Klasė `Square`, kuri implementuoja interfeisą `RegularPolygon` metodą `getNumSides`
    gražina skaičių 4, metodą `getSideLength` gražina kintamojo reikšmę, inicializuotą
    per konstruktorių;
    * Interfeise pridėti 2 defaultinius metodus: `getPerimeter(n * length)` ir `getInteriorAngle((n - 2) 180)`
    * Sukurtoje `RegularPolygonMain` klasėje apskaičiuoti figūrų perimetrus ir plotus.
    */

    int getNumSides();

    double getSideLength();

    double getPerimeter();

    int getInteriorAngle();

    double getArea();

}
