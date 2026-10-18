import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;
import java.util.Collection;


//  LinkedHashMap
//  This collections answer first question; it requires find by ISBN and save insertion order
//  Big O operations
//    - Finding O(1) : it search on specific bucket
//    - Adding O(1) : it ubicate the bucket and insert the object
//

public class Catalog {

    public  Collection<Book> allBooks (){
        return Collections.unmodifiableCollection(books.values());
    }

    public void addBook (Book book){

        if (books.containsKey(book.isbn())){
            throw new IllegalStateException ("Book is already in catalog");
        }

        books.put(book.isbn() , book);
    }

    public Book findByIsbn(String isbn){

        return books.get(isbn);

    }

    public String toString(){
         return books.toString();
    }

    private final Map <String, Book> books;

    public Catalog(){
        this.books = new LinkedHashMap<String,Book>();

    }


public static void main (String args []){

        // String isbn, String title, String author, WaitingList waitingList
    Book book1 = new Book ("A001", "Book1" , "Author 1" , new WaitingList() );
    Book book2 = new Book ("A002", "Book2" , "Author 1" , new WaitingList() );

    Catalog catalog = new Catalog();

    catalog.addBook(book2);
    catalog.addBook(book1);

    book1.members().join("member1");
    book1.members().join("member2");
    System.out.println( "WaitingList: " + book1.members());
    try {
        book1.members().join("member1");
    } catch (Exception e) {
        System.out.println("Exception : " + e );
    }

    System.out.println( "Next member: " + book1.members().next());
    System.out.println( "Books: " + catalog.toString());


    try {
        catalog.addBook(book1);
    } catch (Exception e) {
        System.out.println("Exception : " + e );
    }

    System.out.println( "Books: " + catalog.allBooks());

}
}
