public class Book {
    private int pages;
    private int year;
    private String author;

    public Book(String author,int pages, int year) {
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    public int getPages() {
        return this.pages;
    }

    public int getYear() {
        return this.year;
    }
    public String getAuthor() {
        return this.author;
    }
    public void setYear(int year) {
        this.year = year;
    }
}