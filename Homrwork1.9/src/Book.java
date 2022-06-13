import java.util.Objects;

public class Book {
    private int pages;
    private int year;
    private Author author;


    public Book(Author author,int pages, int year) {
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    public String toString() {
        return author.toString() + "\n" + "page " + pages + "\n" + year + " year" ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && year == book.year && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pages, year, author);
    }

    public int getPages() {
        return this.pages;
    }

    public int getYear() {

        return this.year;
    }
    public String getAuthor() {
        return author.getFirstName() + author.getSurname();
    }
    public void setYear(int year) {

        this.year = year;
    }
}
