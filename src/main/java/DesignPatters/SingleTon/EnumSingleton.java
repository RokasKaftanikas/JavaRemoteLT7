package DesignPatters.SingleTon;

public enum EnumSingleton {

    INSTANCE;

    public static void doSomething(){
        System.out.println("EnumSingleton");
    }

    public static void main(String[] args) {
        EnumSingleton.INSTANCE.doSomething();
    }
}
