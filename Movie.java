// Movie class inherits from Item
public class Movie extends Item {
    
    private int duration;
    
    public Movie() {
        
    }

    public Movie(String title, int year, int duration) {
        super(title, year);       // Call the Item constructor to set title and year
        this.duration = duration; 
    }
    // Setter method to change duration later
    public void setDuration(int duration) {
        this.duration = duration;
    }
    // Getter method to retrieve duration
    public int getDuration() {
        return duration;
    }
    
    @Override
    public String toString() {
        // super.toString() prints title and year from Item
        return super.toString() + String.format(" | Duration: %d mins", duration);
    }
}