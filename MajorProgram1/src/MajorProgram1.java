//We import the necessary packages
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileReader;



public class MajorProgram1 {
    public static void main(String[] args) throws IOException {
        // we create a new object of type BookDatabase named bookDatabase
        BookDatabase bookDatabase = new BookDatabase();
        //we create a new object author of type Author
        Author author = new Author();
        //We create a new object book of type Book
        Book book = new Book();
        Scanner scnr= new Scanner(System.in);

        //We print out our main menu with all different options
        //the program exits if the user chooses 0.
        System.out.println("~~~~~~~~~MAIN MENU~~~~~~~~~");
        System.out.println("Please select one number or 0 to quit:");
        System.out.println("1. View all available books");
        System.out.println("2. Search a book by author name");
        System.out.println("3. Search a book by start/end year");
        System.out.println("4. Search a book by genre");
        System.out.println("5. Add a book");
        System.out.println("6. Remove a book");
        System.out.println("0. To quit");
        System.out.print("Your choice: ");
        int choice = scnr.nextInt();
        if (choice == 0){
            System.out.println("Thank you");
            System.out.println("Quitting...");
            System.exit(0);
        }
        //from line 41-48 we create a new file reader that will read from our file MP1.csv
        //We declare a new string variable named line in which we will store every line the reader reads
        // as long as it is not empty
        else if (choice == 1) {
            try {
                FileReader fileReader = new FileReader("MP1.csv");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    //We create a new array variable that will store the data read separated by a comma
                    //meaning that after each comma the new data will be store in a new substring
                    //And we print out all the data read
                    String[] data = line.split(",");

                    System.out.println(data[0] + ", " + data[1] + ". " + '"' + data[2] + '"' + ", " + data[3] + ", " + data[4] + ", "
                            + data[5] + ", rating:" + data[6]+", " + "$" + data[7]);
                    //We use our setters to set new data, so they can be passed to specific variables
                    //Using trim to make sure the string are converted to either int or double for year, ratings or price
                    author.setFirstName(data[0]);
                    author.setLastName(data[1]);
                    book.setAuthor(author);

                    book.setTitle(data[2]);
                    book.setYear(Integer.parseInt(data[3].trim()));
                    book.setPublisher(data[5]);
                    book.setGenre(data[4]);
                    book.setRating(Double.parseDouble(data[6].trim()));
                    book.setPrice(Double.parseDouble(data[7].substring(0, data[7].length() - 1)));


                }
                //We close our file after reading
                bufferedReader.close();
                fileReader.close();

            } catch (FileNotFoundException e) {
                System.out.println("The file doesn't exist.");
            }
        }
        else if (choice == 2) {
            System.out.print("Please enter the author's name: ");
            String authorName = scnr.next();
            try {
                FileReader fileReader = new FileReader("MP1.csv");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] data = line.split(",");
                    //System.out.print("->");
                    if(data[0].equals(authorName) || data[1].equals(authorName)) {
                        System.out.println(data[0] + ", " + data[1] + ". " + '"' + data[2] + '"' + ", " + data[3] + ", " + data[4] + ", "
                                + data[5] + ", rating:" + data[6]+", " + "$" + data[7]);
                        author.setFirstName(data[0]);
                        author.setLastName(data[1]);
                        book.setAuthor(author);

                        book.setTitle(data[2]);
                        book.setYear(Integer.parseInt(data[3].trim()));
                        book.setPublisher(data[5]);
                        book.setGenre(data[4]);
                        book.setRating(Double.parseDouble(data[6].trim()));
                        book.setPrice(Double.parseDouble(data[7].substring(0, data[7].length() - 1)));
                    }
                }
                bufferedReader.close();
                fileReader.close();

            } catch (FileNotFoundException e) {
                System.out.println("The file doesn't exist.");
            }

        }
        else if (choice == 3){
            System.out.print("Please enter the starting year: ");
            int yearStart = scnr.nextInt();
            System.out.print("Please enter the ending year: ");
            int yearEnd = scnr.nextInt();
            try {
                FileReader fileReader = new FileReader("MP1.csv");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] data = line.split(",");
                    int data1 = Integer.parseInt(data[3].trim());
                    int data2 = Integer.parseInt(data[3].trim());
                    if(data1 >= yearStart && data2 <=yearEnd) {

                        System.out.println(data[0] + ", " + data[1] + ". " + '"' + data[2] + '"' + ", " + data[3] + ", " + data[4] + ", "
                                + data[5] + ", rating:" + data[6]+", " + "$" + data[7]);
                        author.setFirstName(data[0]);
                        author.setLastName(data[1]);
                        book.setAuthor(author);

                        book.setTitle(data[2]);
                        book.setYear(Integer.parseInt(data[3].trim()));
                        book.setPublisher(data[5]);
                        book.setGenre(data[4]);
                        book.setRating(Double.parseDouble(data[6].trim()));
                        book.setPrice(Double.parseDouble(data[7].substring(0, data[7].length() - 1)));
                    }

                }
                bufferedReader.close();
                fileReader.close();

            } catch (FileNotFoundException e) {
                System.out.println("The file doesn't exist.");
            }

        }
        else if (choice == 4){

            System.out.print("Please enter the genre: ");
            String genreSearching = scnr.next();
            try {
                FileReader fileReader = new FileReader("MP1.csv");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] data = line.split(",");

                    if(data[4].equals(genreSearching)) {
                        System.out.println(data[0] + ", " + data[1] + ". " + '"' + data[2] + '"' + ", " + data[3] + ", " + data[4] + ", "
                                + data[5] + ", rating:" + data[6]+", " + "$" + data[7]);
                        author.setFirstName(data[0]);
                        author.setLastName(data[1]);
                        book.setAuthor(author);

                        book.setTitle(data[2]);
                        book.setYear(Integer.parseInt(data[3].trim()));
                        book.setPublisher(data[5]);
                        book.setGenre(data[4]);
                        book.setRating(Double.parseDouble(data[6].trim()));
                        book.setPrice(Double.parseDouble(data[7].substring(0, data[7].length() - 1)));
                    }

                }

                //We close our file after reading
                bufferedReader.close();
                fileReader.close();

            } catch (FileNotFoundException e) {
                System.out.println("The file doesn't exist.");
            }
        }
        else if (choice == 5){
            System.out.println("FIX ME: ADD BOOk");
        }
        else if (choice == 6){
            System.out.println("FIX ME: REMOVE BOOK");
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}