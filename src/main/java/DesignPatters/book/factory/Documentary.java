package DesignPatters.book.factory;

public class Documentary extends Book {

    private int pages;
    private String title;
    private String plotTwist;

    public Documentary(int pages, String title, String plotTwist) {
        this.pages = pages;
        this.title = title;
        this.plotTwist = plotTwist;
    }
    @Override
    public int getPages() {
        return 0;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getPlotTwist() {
        return null;
    }

}
