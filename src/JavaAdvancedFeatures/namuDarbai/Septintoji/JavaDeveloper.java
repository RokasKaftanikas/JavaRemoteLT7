package JavaAdvancedFeatures.namuDarbai.Septintoji;

public class JavaDeveloper extends Developer {

    public JavaDeveloper(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
        System.out.println(JavaDeveloper.class.getSimpleName() + " constructor ir called");
    }

    @Override
    public String textInCapital(String surname){
        return super.textInCapital(String.format("%s, %s", name, surname));
    }
}


