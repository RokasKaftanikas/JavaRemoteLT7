package DesignPatters.factory.computer;

public class TestFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputerWithLowestPrice("pc","2 GB","500 GB","2.4 GHz");

        Computer server = ComputerFactory.getComputerWithLowestPrice("server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);
    }

}
