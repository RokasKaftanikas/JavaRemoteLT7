package JavaAdvancedFeatures.namuDarbai.Antroji;

public class Dogs {

    public static void main(String[] args) {
        Dog[] dogArray;
        dogArray = new Dog[3];
        dogArray[0] = new Dog("terjeras", 3, "juodas");
        dogArray[1] = new Dog("cvegsnauceris", 6, "baltas");
        dogArray[2] = new Dog("vokieciu aviganis", 5, "rudas");

        System.out.println(OldestDog(dogArray));
        System.out.println(AverageAge(dogArray));

    }

    private static String OldestDog(Dog[] dogArray) {
        String oldestDog = null;
        int oldestAge = 0;
        for (int i = 0; i < dogArray.length; i++) {
            if (dogArray[i].getAge() > oldestAge) {
                oldestAge = dogArray[i].getAge();
                oldestDog = dogArray[i].getName();
            }
        }
        return oldestDog;
    }

    private static String AverageAge(Dog[] dogArray){
        double sum = 0;
        for(int j = 0; j < dogArray.length; j++){
            sum = sum + dogArray[j].getAge();
        }
        return "Average age: " + sum/dogArray.length;

       /*
        Dog dog1 = new Dog("terjeras", 3, "juodas");
        Dog dog2 = new Dog("cvegsnauceris", 6, "baltas");
        Dog dog3 = new Dog("vokieciu aviganis", 5,"rudas");

        int vidurkis = (dog1.age + dog2.age + dog3.age) / 3;
        System.out.println("Vidurkis yra " + vidurkis + " metai");

        if (dog1.age > dog2.age && dog1.age > dog3.age){
            System.out.println(dog1.name + " " + dog1.age + " metai");
        } else if (dog2.age > dog1.age && dog2.age > dog3.age){
            System.out.println(dog2.name + " " +dog2.age + " metai");
        } else {
            System.out.println(dog3.name + " " + dog3.age + " metai");
        }
        */
    }
}
