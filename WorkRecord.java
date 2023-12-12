public class WorkRecord {
    private String name; 
    private int hours;  

    
    public WorkRecord(String name) {
        this.name = name;
        this.hours = 0;
    }

    
    public int getHours() {
        return hours;
    }

    public void addHours(int moreHours) {
        if (moreHours > 0) {
            hours += moreHours;
        }
    }

    
    @Override
    public String toString() {
        return name + ": " + hours + " hours";
    }
}
