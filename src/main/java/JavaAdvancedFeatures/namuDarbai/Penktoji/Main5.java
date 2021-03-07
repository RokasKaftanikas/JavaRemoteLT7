package JavaAdvancedFeatures.namuDarbai.Penktoji;

public class Main5 {
    /*
    5.  Susikurti objektą Circle, kuris turės laukus:
       * `radius` ir `color`;
       * Naudoti sukurtą objektą ir apskaičiuoti apskritimo ilgį, plotą ir išspausdinti apskritimo spalvą.
       P.S. `Math.PI`- naudojama matematinei PI reikšmei gauti.
     */
    public static void main(String[] args) {
        Circle[] circleArray;
       circleArray = new Circle[1];
        circleArray[0] = new Circle(6, "pink");

        System.out.println(getLenghtColor(circleArray));

    }

    public static String getLenghtColor(Circle[] circleArray){
        String color = null;
        double lenght = 0;
        double area = 0;
        for (int i = 0; i < circleArray.length; i++){
            lenght = circleArray[i].getRadius() * 2 *Math.PI;
            area = circleArray[i].getRadius() * Math.pow(Math.PI, 2);
            color = circleArray[i].getColor();
        }
        return "lenght of the circle is " + lenght + " and the area is " + area + "also, the color is " + color;
    }

}
