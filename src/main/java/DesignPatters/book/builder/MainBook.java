package DesignPatters.book.builder;

public class MainBook {
    public static void main(String[] args) {
        Book.BookBuilder book = new Book.BookBuilder(100, "Pieniu vynas").
                isITaHardCover(false).
                getColor("green");

        Book newBook = book.build();

        System.out.println(newBook);
    }
}
