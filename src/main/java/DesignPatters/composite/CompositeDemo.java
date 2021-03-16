package DesignPatters.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Department skyrius = new SkyriusDepartment("Java sales");
        SalesDepartment salesDepartment = new SalesDepartment(1, "Sales department");
        salesDepartment.addSkyriu(skyrius);
        salesDepartment.addSkyriu(new SkyriusDepartment("Skyrius 2"));


        Department financialDepartment = new FinancialDepartment(2, "Financial department");

        HeadDepartment headDepartment = new HeadDepartment(3, "Head department");

        headDepartment.addDepartMent(salesDepartment);
        headDepartment.addDepartMent(financialDepartment);

        headDepartment.printDepartmentName();
    }
}
