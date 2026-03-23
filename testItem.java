import java.util.ArrayList;
import java.util.Scanner;

public class testItem {
    // Create an ArrayList to store Book and Movie objects
    private static ArrayList<Item> items = new ArrayList<>();

    public static void main(String[] args) {
        populateItems(); // Fill the list with sample data
        Scanner sc = new Scanner(System.in);
        int choice;

        
        do {
            System.out.println("Test Driver Items");
            System.out.println("1. Display Items");
            System.out.println("2. Find Items");
            System.out.println("3. Sort Items");
            System.out.println("4. Exit");
            choice = sc.nextInt();   
            sc.nextLine();           

            // Handle menu choices
            switch (choice) {
                case 1:
                    displayItems(); // Show all items
                    break;
                case 2:
                    findItem(); // Search for an item by title
                    break;
                case 3:
                    sortItems(); // Sort items by title
                    System.out.println("Items sorted by title.");
                    break;
                case 4:
                    System.out.println("Thank you for testing...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4); 
    }

    // Add 10 sample Book and Movie objects to the list
    private static void populateItems() {
        items.add(new Book("The Hobbit", 1937, "J.R.R. Tolkien"));
        items.add(new Movie("The Last Airbender", 2010, 190));
        items.add(new Book("1984", 1949, "George Orwell"));
        items.add(new Movie("Inception", 2010, 148));
        items.add(new Book("Pride and Prejudice", 1813, "Jane Austen"));
        items.add(new Movie("The Matrix", 1999, 136));
        items.add(new Book("To Kill a Mockingbird", 1960, "Harper Lee"));
        items.add(new Movie("Interstellar", 2014, 169));
        items.add(new Book("The Great Gatsby", 1925, "F. Scott Fitzgerald"));
        items.add(new Movie("The Dark Knight", 2008, 152));
    }

    // Print all items in the list
    private static void displayItems() {
        for (int k = 0; k < items.size(); k++) {
            System.out.println(items.get(k));
        }
    }

    // Ask user for a title and search for it in the list
    private static void findItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title: ");
        String FindTitle = sc.nextLine();

        // Loop through items to find a match
        for (int k = 0; k < items.size(); k++) {
            Item item = items.get(k);
            if (item.getTitle().equalsIgnoreCase(FindTitle)) {
                System.out.println("Found Item: " + item);
                return; // Stop once found
            }
        }
        // If no match found
        System.out.println("Unable to find item");
    }

    // Sort items alphabetically by title using Selection Sort
    public static void sortItems() {
        for (int k = 0; k < items.size(); k++) {
            int minIndex = k;
            for (int j = k + 1; j < items.size(); j++) {
                if (items.get(j).getTitle().compareToIgnoreCase(items.get(minIndex).getTitle()) < 0) {
                    minIndex = j;
                }
            }
            // Swap the smallest title with current position
            Item temp = items.get(minIndex);
            items.set(minIndex, items.get(k));
            items.set(k, temp);
        }
    }
}