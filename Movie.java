

public class Movie extends Item
{
    private int duration;
    
    public Movie()
    {
    
    }
    
    public Movie(String title, int year, int duration)
    {
        super(title, year);
        this.duration = duration;
    }
    
    public void setDuration(int duration)
    {
        this.duration = duration;
    }
    
    public int getDuration()
    {
        return duration;
    }
    
    @Override
    public String toString()
    {
        return String.format("Duration: %s", duration);
    }
}