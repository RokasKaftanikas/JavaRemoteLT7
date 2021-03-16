package DesignPatters.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{
    private final List<String> empList;

    public Employees(){
        empList = new ArrayList<>();
    }

    public Employees(List<String> list){
        this.empList=list;
    }

    public void loadData(){
        //read all employees from database and put into the list
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<>();
        for(String s : this.getEmpList()){
            temp.add(s);
        }
        return new Employees(temp);
    }


//    HW kodel gaunamas tas pats listas, kai print
//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
//    }

}
