
public class Book extends Item
{
    private String author;
    
    public Book ()
    {
        
    }
    
    public Book(String title, int year, String author)
    {
        super(title, year);
        this.author = author;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public void setAuthor(String author)
    {
        this.author = author;
    }
    
    @Override
    public String toString()
    {
        return String.format("Author: %s ", author);
    }
}