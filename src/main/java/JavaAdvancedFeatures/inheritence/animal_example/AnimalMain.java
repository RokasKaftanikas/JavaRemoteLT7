package JavaAdvancedFeatures.inheritence.animal_example;

public class AnimalMain {
    public static void main(String[] args) {
        Cat cat = new Cat("ginger", "miau",true);
        Dog dog = new Dog("doberman","whoof", true);

       String catVoice = cat.yieldVoice();
        System.out.println(dog.yieldVoice());
        System.out.println("beautiful " + catVoice);

        dog.printAnimal();
            }
        }
