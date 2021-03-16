package DesignPatters.book.factory;

public abstract class Book {

    public abstract int getPages();
    public abstract String getTitle();
    public abstract String getPlotTwist();

    @Override
    public String toString() {
        return "Pages= " + this.getPages() +
                ", the title is " + this.getTitle() +
                ", it has a plot twish which is " +
                this.getPlotTwist();
    }
}
