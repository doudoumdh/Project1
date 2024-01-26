public class Book {
    //define our variables(privates)
    private Author author;
    private String title;
    private int year;
    private String publisher;
    private String genre;
    private double rating;
    private double price;

    //our default constructor
    public Book() {
    }
    public Book(Author author, String title, int year, String publisher,
                String genre, double rating, double price){
        this.author = author;
        this.title = title;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.rating = rating;
        this.price = price;
    }
    // accessors or getters
    public Author getAuthor() {

        return author;
    }
    public String getTitle(){

        return title;
    }
    public int getYear() {

        return year;
    }
    public String getPublisher() {

        return publisher;
    }
    public String getGenre() {

        return genre;
    }
    public double getRating() {

        return rating;
    }
    public double getPrice() {

        return price;
    }
    // mutators or setters
    public void setAuthor(Author author) {

        this.author = author;
    }
    public void setTitle(String title) {

        this.title = title;
    }
    public void setYear(int year) {

        this.year = year;
    }
    public void setPublisher(String publisher) {

        this.publisher = publisher;
    }
    public void setGenre(String genre) {

        this.genre = genre;
    }
    public void setRating(double rating) {

        this.rating = rating;
    }
    public void setPrice(double price) {

        this.price = price;
    }
    //toString method
    public String toString(){
        return "The author of the book of genre "+ genre+ " with title " + title + " is " + author +
                ". The book is published in " + year + " by " + publisher +
                " and the book has a rating of " + rating + " and costs "+ price;
    }
}
