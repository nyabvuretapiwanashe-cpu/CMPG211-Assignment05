
import java.util.ArrayList;

public class testItem
{
    private static ArrayList<Item> items = new ArrayList <>();
    
    private static void displayItems()
    {
        items.add(new Book("The Hobbit", 1937, "J.R.R Tolkien"));
        items.add(new Movie("The Last Airbender", 2005, 190));
        items.add(new Book("The Hobbit", 1937, "J.R.R Tolkien"));
        items.add(new Movie("The Hobbit", 1937, 148 ));
        items.add(new Book("The Hobbit", 1937, "J.R.R Tolkien"));
        items.add(new Movie("The Hobbit", 1937, 150));
        items.add(new Book("The Hobbit", 1937, "J.R.R Tolkien"));
        items.add(new Movie("The Hobbit", 1937, 150));
        items.add(new Book("The Hobbit", 1937, "J.R.R Tolkien"));
        items.add(new Movie("The Hobbit", 1937, 120));
        
    }
}