

class Item
{
    private String title;
    private int year;
    
    public Item()
    {
        
    }
    
    public Item(String title, int year)
    {
        this.title = title;
        this.year = year;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public void setYear(int year)
    {
        this.year = year;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getYear()
    {
        return year;
    }
    
    @Override
    public String toString()
    {
        return String.format ("Movie Title: %s \n Year: %d" , title, year);
    }
}