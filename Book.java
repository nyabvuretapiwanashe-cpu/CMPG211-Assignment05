
public class Book extends Item {
    private String author;

    
    public Book() {
        
    }

    public Book(String title, int year, String author) {
        super(title, year);     // Call the Item constructor to set title and year
        this.author = author;   
    }

    // Getter method to retrieve author
    public String getAuthor() {
        return author;
    }

    // Setter method to change author later
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        // super.toString() prints title and year from Item
        // Add author info for Book
        return super.toString() + String.format(" | Author: %s", author);
    }
}