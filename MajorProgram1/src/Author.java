import javax.swing.plaf.PanelUI;

public class Author {
    // define our variables
    private String firstName;
    private String lastName;

    //create our method author which is a default constructor
    // it takes no argument
    public Author() {
    }
    //define our method author, with two string arguments
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //our accessors for firstName and lastName
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    //our mutators
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    //our toString method that returns the first and last name
    public String toString(){
        return firstName + ", "+ lastName;
    }
}
