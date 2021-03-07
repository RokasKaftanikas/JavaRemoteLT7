package JavaAdvancedFeatures.classesIntro.anonymous_classes;

public class AnonymousMainExample {
    public static void main(String[] args) {

        HttpExecutor executor = new HttpExecutor(){
            public String executeRequest(){
                return "Siandien labai vesu";
            }
        };

        System.out.println(executor.executeRequest());
    }
}
