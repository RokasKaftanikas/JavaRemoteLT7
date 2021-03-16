package DesignPatters.book.factory;

public class BookMain {

    public static void main(String[] args) {
        Book romantic = BookFactory.getTheBookWithTheMostPages("Romantic", 100, "kjkje", "Everyone dies");

        System.out.println("What is the book: " + romantic);
    }
}
