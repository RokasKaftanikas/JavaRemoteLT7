package DesignPatters.book.singleton;

public class SingletonBookEager {
    private static final SingletonBookEager book = new SingletonBookEager();

    private SingletonBookEager() {
    }

    public static SingletonBookEager getInstance(){
        return book;
    }

    public static void main(String[] args) {
        SingletonBookEager book = SingletonBookEager.getInstance();
        System.out.println(book);
    }

}
