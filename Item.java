
class Item {
    
    private String title; 
    private int year;     

    
    public Item() {
        
    }

    public Item(String title, int year) {
        this.title = title; 
        this.year = year;   
    }

    // Setter method to change the title later
    public void setTitle(String title) {
        this.title = title;
    }

    // Setter method to change the year later
    public void setYear(int year) {
        this.year = year;
    }

    // Getter method to retrieve the title
    public String getTitle() {
        return title;
    }

    // Getter method to retrieve the year
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        // Format: Title and Year
        return String.format("Title: %s | Year: %d", title, year);
    }
}