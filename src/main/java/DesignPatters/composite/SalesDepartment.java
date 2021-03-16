package DesignPatters.composite;

import java.util.ArrayList;
import java.util.List;

public class SalesDepartment implements Department{

    private Integer id;
    private String name;
    private List<Department> skyriai;


    public SalesDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        skyriai = new ArrayList<>();
    }

    public void addSkyriu(Department skyriu){
        skyriai.add(skyriu);
    }



    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
        skyriai.forEach(Department::printDepartmentName);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
