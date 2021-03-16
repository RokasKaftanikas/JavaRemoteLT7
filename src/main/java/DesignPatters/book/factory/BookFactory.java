package DesignPatters.book.factory;

public class BookFactory {

    public static Book getTheBookWithTheMostPages(String type, int pages, String title, String plotTwist){
        if("Romantic".equalsIgnoreCase(type)) return new Romantic(pages, title, plotTwist);
        else if ("Documentary".equalsIgnoreCase(type)) return new Documentary(pages, title, plotTwist);

        return null;
    }
}
