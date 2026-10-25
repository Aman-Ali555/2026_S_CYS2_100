class Book{
    String title;
    Book(String title){
        this.title = title;
    }
}
class Library{
    Book book;
    Library(Book b){
        this.book = b;
    }
}
public class Task7 {
    static void main(String[] args) {
        Book b1 = new Book("Java Basics");
        Library lib = new Library(b1);
        System.out.println(lib.book.title);
    }
}
