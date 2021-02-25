package JavaAdvancedFeatures.namuDarbai.Septintoji;

public abstract class Developer extends Person{

    protected int yearsOfExperience;
    
    public Developer(String name, int yearsOfExperience) {
        super(name);
        this.yearsOfExperience = yearsOfExperience;
        System.out.println(Developer.class.getSimpleName() + " constructor is called");
    }

    public String getDeveloper(){
        return String.format("Name: %s age of experience: %s", name, yearsOfExperience);
    }
}
