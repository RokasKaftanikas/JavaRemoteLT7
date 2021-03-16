package DesignPatters.book.builder;

public class Book {

    //required information
    private String title;
    private int pages;

    //additional information;
    private String color;
    private boolean isItAHardCover;

    private Book(String title, int pages, String color, boolean isItAHardCover){
        this.title = title;
        this.pages = pages;
        this.color = color;
        this.isItAHardCover = isItAHardCover;
    }

    public String getTitle() {
        return title;
    }

    public boolean isItAHardCover(){
        return isItAHardCover;
    }

    public String getColor() {
        return color;
    }

    public int getPages() {
        return pages;
    }

    public static class BookBuilder{

        //required information
        private String title;
        private int pages;

        //additional information;
        private String color;
        private boolean isItAHardCover;

        public BookBuilder(int pages, String title){
            this.pages = pages;
            this.title = title;
        }

        public BookBuilder isITaHardCover(boolean isItAHardCover){
            this.isItAHardCover = isItAHardCover;
            return this;
        }

        public BookBuilder getColor(String color){
            this.color = color;
            return this;
        }

        public Book build(){
            return new Book(title, pages, color, isItAHardCover);
        }
    }
}
