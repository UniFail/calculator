public class Main {
    public static void printSeparator(){
        System.out.println("==============================");
    }
    public static void main(String[] args) {
        printSeparator();
        Book book1 = new Book(new Author("Joanne ","Rowling"),190,1900,"1");
        book1.setYear(1997);
        System.out.println("Book name 'Hurry Potter'" + "\n" +  book1);
        printSeparator();
        Book book2 = new Book(new Author("Stephen ","King"),1138,1986,"2");
        System.out.println("Book name 'It'" + "\n" +  book2);
        printSeparator();
        System.out.println(book1.equals(book2));
        System.out.println();
    }
}
