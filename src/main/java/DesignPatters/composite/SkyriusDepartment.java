package DesignPatters.composite;

public class SkyriusDepartment implements Department{

    private final String name;

    public SkyriusDepartment(String name) {
        this.name = name;
    }

    @Override
    public void printDepartmentName() {
        System.out.println("Skyriaus pavadinimas " + name);
    }
}
