package DesignPatters.book.factory;

public class Romantic extends Book{

    private int pages;
    private String title;
    private String plotTwist;

    public Romantic(int pages, String title, String plotTwist) {
        this.pages = pages;
        this.title = title;
        this.plotTwist = plotTwist;
    }

    @Override
    public int getPages() {
        return pages;
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
