import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class BookDatabase {
    // defining our variable
    private ArrayList<Book> book = new ArrayList<>();

    // our methods
    public BookDatabase() {
    }
    public BookDatabase(ArrayList<Book> book){
        this.book = book;
    }
    // accessors
    public ArrayList<Book> getBooks() {

        return book;
    }
    //mutators
    public void setBooks(ArrayList<Book> books) {

        this.book = books;
    }
    // methods: addBook and removeBook
    public void addBook(Book book){
        this.book.add(book);
    }
    public void removeBook(Book book){
        this.book.remove(book);

    }
    //search methods
    //FIX ME ON RETURNS
    public ArrayList<Book> search(Author Author){
        ArrayList<Book> authorBook = new ArrayList<>();


        return authorBook;

    }
    public ArrayList<Book> search(int startYear, int endYear){
        ArrayList<Book> booksInRange = new ArrayList<>();

        return booksInRange;

    }
    public ArrayList<Book> search(String genre ){
        ArrayList<Book> booksGenre = new ArrayList<>();

        return booksGenre;
    }
    public String toString(){

        return "";
    }

}
