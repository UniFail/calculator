public class Main {
    public static void printSeparator(){
        System.out.println("==============================");
    }
    public static void main(String[] args) {
        printSeparator();
        Author author1 = new Author("Joanne", "Rowling");
        Book book1 = new Book(author1.getFirstName() + " " + author1.getSurname(),190,1900);
        book1.setYear(1997);
        System.out.println("Book name 'Hurry Potter'" + "\n" + "Author " + book1.getAuthor());
        System.out.println(book1.getPages() + " pages");
        System.out.println(book1.getYear() + " year");
        printSeparator();
        Author author2 = new Author("Stephen", "King");
        Book book2 = new Book(author2.getFirstName() + " " + author2.getSurname(),1138,1986);
        System.out.println("Book name 'It'" + "\n" + "Author " + book2.getAuthor());
        System.out.println(book2.getPages() + " pages");
        System.out.println(book2.getYear() + " year");
        printSeparator();
    }
}