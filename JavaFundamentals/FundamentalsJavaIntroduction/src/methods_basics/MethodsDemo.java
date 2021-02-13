package methods_basics;

public class MethodsDemo {
    public static void main(String[] args) {
        //metodui perduodama tik jo reiksme, o ne kintamasis
        //Java yra pass by value kalba, t.y. perduodant argumenta
    }

    //first method
    static void pasisveikink(){
        System.out.println("labas rytas");
        System.out.println("laba diena");
        System.out.println("labas vakaras");
    }

    int valanda;
    static void NewBetterMethod(int valanda) {
        if (valanda < 12 && valanda > 7) {
            System.out.println("labas rytas");
        } else if (valanda < 18){
            System.out.println("laba diena");
        } else if (valanda < 24) {
            System.out.println("labas vakaras");
        }
        return;
    }



    static void sudauginkDuSkaiciusIrIsvesk(int a, int b) {
        System.out.println(a*b);
    }

    static int sudauginkDuSkaicius(int a, int b){
        int rezultatas = a*b;
        return rezultatas;

    }



}
