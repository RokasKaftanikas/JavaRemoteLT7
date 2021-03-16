package DesignPatters.book.singleton;

public class SingletonBookLazy {

    private static String nameOfBook = "Issues";
    private static SingletonBookLazy book;

    private SingletonBookLazy() {
    }

    public static SingletonBookLazy getInstance(){
        if(book == null){
            book = new SingletonBookLazy();
        }
        return book;
    }
    public void getNameOfBook(){
        System.out.println("1684");
    }

    public static void main(String[] args) {
        SingletonBookLazy book = SingletonBookLazy.getInstance();

        book.getNameOfBook();
        System.out.println(book);
    }
}
